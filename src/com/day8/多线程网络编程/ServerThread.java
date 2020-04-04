package com.day8.多线程网络编程;

import java.io.*;
import java.net.Socket;

/**
 * Created by lgm
 * on 2020/4/2.
 */
public class ServerThread extends Thread {

    private Socket s = null;
    private InputStream inputStream = null;

    public ServerThread(Socket s) throws Exception {
        this.s = s;
        inputStream = s.getInputStream();

    }

    @Override
    public void run() {
        try {
            int content = 0;
            byte[] bytes = new byte[1024];
            while ((content = inputStream.read(bytes)) != -1) {

                System.out.println("来自客户端的信息" + new String(bytes, 0, content));
                for (Socket s1 : MyServer.list) {
                    PrintStream stream = new PrintStream(s1.getOutputStream());
                    stream.print("你好："+new String(bytes, 0, content));
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}