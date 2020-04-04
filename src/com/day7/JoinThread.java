package com.day7;

/**
 * Created by lgm
 * on 2020/4/1.
 */
public class JoinThread extends Thread {

    public static void main(String[] args) throws InterruptedException {
        new JoinThread("新线程").start();

        for (int i = 0; i < 100; i++) {
            if(i==20){
                JoinThread joinThread = new JoinThread("被join的线程");
                joinThread.start();
                joinThread.join();
            }
            System.out.println(Thread.currentThread().getName()+""+i);
        }
    }

    public JoinThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "==" + i);
        }

    }
}
