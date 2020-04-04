package com.day8.多线程网络编程;

import java.util.Scanner;

/**
 * Created by lgm
 * on 2020/4/2.
 */
public class Demo {
    public static void main(String[] args) {

        System.out.println("请输入你想对服务器发的信息：");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){

            String next = scanner.next();
            System.out.println(next);
        }
    }
}
