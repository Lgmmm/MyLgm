package com.day7;

import javax.xml.transform.Source;

/**
 * Created by lgm
 * on 2020/4/1.
 */
public class SecondThread implements Runnable {
    private int i;
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "==" + i);
            if (i == 20) {
                SecondThread secondThread = new SecondThread();

                Thread thread = new Thread(secondThread, "线程1");
                Thread thread1 = new Thread(secondThread, "线程2");
                thread.start();
                thread1.start();

            }
        }

    }

    @Override
    public void run() {
        for (; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"=="+i);
        }
    }
}
