package com.day7;

/**
 * Created by lgm
 * on 2020/4/1.
 */
public class DaemonThread extends Thread{

    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();

        for(int i =0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"="+i);
        }
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(getName()+"++"+i);
        }
    }
}
