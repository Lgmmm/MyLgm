package com.day8.多线程网络编程;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by lgm
 * on 2020/4/2.
 */
public class MyServer {
    static  List<Socket> list = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6666);

        while(true){
            Socket accept = ss.accept();
            new ServerThread(accept).start();
            list.add(accept);
        }



    }
}
