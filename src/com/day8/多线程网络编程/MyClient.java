package com.day8.多线程网络编程;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by lgm
 * on 2020/4/2.
 */
public class MyClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1",6666);
        System.out.println("客户端");
        new Thread(new ClientThread(socket)).start();
        PrintStream printStream = new PrintStream(socket.getOutputStream());

        System.out.println("请输入你想对服务器发的信息：");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){

            String next = scanner.next();

            printStream.print(next);
            System.out.println(next);
        }

    }
}
