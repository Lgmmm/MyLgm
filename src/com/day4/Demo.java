package com.day4;

import java.util.Random;

/**
 * Created by lgm
 * on 2020/3/28.
 */
public class Demo {
    public static void main(String[] args) {
       int i =(int)Math.random()*10;
        System.out.println("Math.random()=="+(int)(Math.random()*10));
        Random r = new Random();
        System.out.println(r.nextInt(26));
    }
}
