package com.day9.线程组;

/**
 * Created by lgm
 * on 2020/4/3.
 */
public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        for(int i = 0;i<20;i++){
            System.out.println(getName()+"线程的i变量"+i);
        }
    }
}
