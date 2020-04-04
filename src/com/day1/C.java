package com.day1;

/**
 * Created by lgm
 * on 2020/3/26.
 */
public interface C {
    public static final int A=1;
    void get2();

    static void get(){
        System.out.println("nihao" );
    }
   default void say(){
        System.out.println("nihao ");
    }
}
