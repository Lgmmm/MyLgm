package com.day8.多线程网络编程;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by lgm
 * on 2020/4/2.
 */
public class ClientThread extends Thread{
    Socket socket = null;
    InputStream in =null;

    public ClientThread(Socket socket) throws Exception{
        this.socket = socket;
        in = socket.getInputStream();

    }

    @Override
    public void run() {
        try {

            int len =0;
            byte[] bytes = new byte[1024];
            while((len = in.read(bytes)) != -1){
                System.out.println(new String(bytes,0,len));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
