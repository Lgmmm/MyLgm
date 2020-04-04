package com.day3;

import sun.misc.GC;

import java.util.Arrays;

/**
 * Created by lgm
 * on 2020/3/27.
 */
public class ColorTest {
    public static void main(String[] args) {
        Color c = Color.valueOf("BLUE");
        System.out.println(c);
        Color[] c1 = Color.values();
        System.out.println(Arrays.toString(c1));
        c.a=10;
        System.out.println(c.a);
        System.out.println(c.b);

        System.out.println(c.getName());

        Runnable r =() ->{

        };

            System.gc();
            Runtime.getRuntime().gc();;

    }
}
