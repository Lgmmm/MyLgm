package com.day9.线程组;

/**
 * Created by lgm
 * on 2020/4/3.
 */
public class Demo {

    public static void main(String[] args) {
        ThreadGroup t1 = new ThreadGroup("线程组1");
        Test test = new Test();
        Test test2 = new Test();

        Thread thread = new Thread(t1, test);
        Thread thread1 = new Thread(t1, test2);
        thread.start();
        thread1.start();

        System.out.println(t1.getName());
        System.out.println(t1.activeCount());
        System.out.println(t1.activeGroupCount());


    }
}


class Test extends Thread{

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
    }
}
