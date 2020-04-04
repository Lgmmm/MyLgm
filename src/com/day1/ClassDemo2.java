package com.day1;

import com.day1.ClassDemo;

/**
 * Created by lgm
 * on 2020/3/26.
 */
public class ClassDemo2  extends ClassDemo {
    public static void main(String[] args) {

    }


    public int say2= say2();
    public static int get2 = get2();


    static {
        System.out.println("ClassDemo2静态代码块01");
    }
    {
        System.out.println("ClassDemo2普通代码块01");
    }

    ClassDemo2(){
        System.out.println("ClassDemo2构造构造函数");
    }


    public Integer say2(){
        System.out.println("ClassDemo2say方法");
        return 1;
    }

    public static Integer get2(){
        System.out.println("ClassDemo2get方法");
        return 2;
    }
}
