package com.day7;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by lgm
 * on 2020/4/3.
 */
public class MyTest {
    public static void main(String[] args) {


        Test2 t = new Test2();

        Thread thread1 = new Thread(t, "甲");
        Thread thread2 = new Thread(t, "乙");

        thread1.start();
        thread2.start();
    }

}


class Test2 implements Runnable {


    ThreadLocal<Integer> lo = new ThreadLocal();
    ReentrantLock lock = new ReentrantLock();

    public Test2() {

    }

    @Override
    public void run() {
        lo.set(50);

        Integer num = lo.get();
        while (num > 0) {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "当前剩余票数" + num);
            num--;
            lock.unlock();

        }

    }

}

