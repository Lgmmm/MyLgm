package com.day9.RPC.Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by lgm
 * on 2020/4/3.
 */
public class ServerCenter implements Server {

    public static HashMap<String, Class> hm = new HashMap<String, Class>();
    private int port;
    private ExecutorService executor = Executors.newFixedThreadPool(4);
    private boolean isRuning = false;

    public ServerCenter(int port) {
        this.port = port;
    }


    @Override
    public void start() {
        ServerSocket socket = null;
        try {
            socket = new ServerSocket();
            socket.bind(new InetSocketAddress(port));
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean isRuning = true;
        while (true) {
            Socket ss = null;
            try {
                ss = socket.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }
            executor.execute(new ServiceTask(ss));
        }

    }

    @Override
    public void stop() {
        executor.shutdown();
        isRuning = false;
    }

    @Override
    public void register(String serviceName, Class serviceImpl) {
        hm.put(serviceName, serviceImpl);

    }

    private static class ServiceTask implements Runnable {

        private Socket ss;

        public ServiceTask() {
        }

        public ServiceTask(Socket ss) {
            this.ss = ss;
        }

        @Override
        public void run() {
            ObjectInputStream in = null;
            ObjectOutputStream out = null;
            try {

                in = new ObjectInputStream(ss.getInputStream());
                String serviceName =  in.readUTF();
                String menthodName = in.readUTF();
                Class[] getParameterTypes = (Class[]) in.readObject();
                Object[] args = (Object[]) in.readObject();


                Class serviceClass = hm.get(serviceName);
                System.out.println(serviceClass);

                Method method = serviceClass.getMethod(menthodName, getParameterTypes);
                Object invoke = method.invoke(serviceClass.newInstance(), args);

                out = new ObjectOutputStream(ss.getOutputStream());
                out.writeObject(invoke);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (in != null) in.close();
                    if (out != null) out.close();
                    if (ss != null) ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        }
    }
}
