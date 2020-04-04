package com.day3;

/**
 * Created by lgm
 * on 2020/3/27.
 * 不可变类
 */
public  class FinalClass {
    public final int no;
    private final int age ;
    public FinalClass(int age,int no){
        this.age = age;
        this.no = no;

    }

    public int getNo() {
        return no;
    }

    public int getAge() {
        return age;
    }
}
