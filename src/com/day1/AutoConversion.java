package com.day1;

/**
 * Created by lgm
 * on 2020/3/25.
 */
public class AutoConversion {
    public static void main(String[] args) {
        char a= '你';
        int b = a;
        System.out.println(b);


        int  i =2000000;
        byte k = (byte) i;

        System.out.println(k);

        System.out.println((int)Math.random()*26+97);
    }
}
