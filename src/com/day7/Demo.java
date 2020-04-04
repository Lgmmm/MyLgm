package com.day7;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by lgm
 * on 2020/4/1.
 */
public class Demo {
    public static void main(String[] args) {
        Account a = new Account("123", 1000);
        DrawThread drawThread = new DrawThread("甲", a, 800);
        DrawThread drawThread2 = new DrawThread("乙", a, 800);
        drawThread.start();
        drawThread2.start();

    }

    @Test
    public void test90() {
        FutureTask<Integer> f = new FutureTask<Integer>(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "" + i);
            }
            return 1;
        });
        new Thread(f).start();

    }

    public void test() throws Exception {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
        Condition condition = lock.newCondition();
        condition.await();
        condition.signalAll();
    }

    public void test2() {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Runnable r = () -> {
            for (int i = 1; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "" + i);
            }

        };
        pool.submit(r);
        pool.shutdown();
    }

}
