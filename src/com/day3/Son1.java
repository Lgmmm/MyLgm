package com.day3;

/**
 * Created by lgm
 * on 2020/3/27.
 */
public class Son1 extends Father1 {
    int b =20;

    public static void main(String[] args) {
        Father1 f1 = new Son1();
        System.out.println(f1.a);
    }
}
