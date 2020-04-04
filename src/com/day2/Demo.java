package com.day2;

import java.sql.SQLOutput;

/**
 * Created by lgm
 * on 2020/3/26.
 */
public class Demo {

    public static void main(String[] args) {

        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;

        System.out.println(i1==i2);
        System.out.println(i3==i4);

        Demo d = new Demo();
        String s="hello";
        d.change(s);
        System.out.println(s);


    }

    public void change(String i){
        i += "world";
    }

}
