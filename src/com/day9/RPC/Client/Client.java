package com.day9.RPC.Client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by lgm
 * on 2020/4/3.
 */
public class Client {
    @SuppressWarnings("unchecked")
    public static <T> T getRemoteProxyObj(Class serviceName, InetSocketAddress address) {

        return (T) Proxy.newProxyInstance(serviceName.getClassLoader(), new Class<?>[]{serviceName}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) {

                Socket socket = new Socket();
                ObjectOutputStream out = null;
                ObjectInputStream in = null;
                try {
                    socket.connect(address);

                    out = new ObjectOutputStream(socket.getOutputStream());
                   // System.out.println(serviceName.toString());
                    out.writeUTF(serviceName.getName());
                    out.writeUTF(method.getName());
                    out.writeObject(method.getParameterTypes());
                    out.writeObject(args);

                    in = new ObjectInputStream(socket.getInputStream());
                    return in.readObject();
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                } finally {
                    try {
                        if (socket != null) {
                            socket.close();
                        }
                        if (out != null) {
                            out.close();
                        }
                        if (in != null) {
                            in.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }


            }
        });

    }
}
