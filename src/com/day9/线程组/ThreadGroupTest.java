package com.day9.线程组;

/**
 * Created by lgm
 * on 2020/4/3.
 */
public class ThreadGroupTest {
    public static void main(String[] args) {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        System.out.println("主线程组名字"+threadGroup.getName());
        System.out.println("主线程是否为后台线程"+threadGroup.isDaemon());
        new MyThread("主线程组的线程").start();

        ThreadGroup group = new ThreadGroup("新线程组");
        group.setDaemon(true);

        System.out.println("group线程组是否为后台线程组"+group.isDaemon());

        MyThread tt = new MyThread(group, "group组的线程甲");
        tt.start();
        new MyThread(group,"group组的线程乙").start();

    }
}
