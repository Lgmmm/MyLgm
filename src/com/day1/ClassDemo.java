package com.day1;

/**
 * Created by lgm
 * on 2020/3/26.
 */
public class ClassDemo {

    public int say= say();
    public static int get = get();

    static {
        System.out.println("ClassDemo静态代码块01");
    }

    {
        System.out.println("ClassDemo普通代码块01");
    }

    ClassDemo(){
        System.out.println("ClassDemo构造构造函数");
    }


    public Integer say(){
        System.out.println("ClassDemosay方法");
        return 1;
    }

    public static Integer get(){
        System.out.println("ClassDemoget方法");
        return 2;
    }
}
