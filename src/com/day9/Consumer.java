package com.day9;

import java.util.concurrent.BlockingQueue;

/**
 * Created by lgm
 * on 2020/4/3.
 */
public class Consumer extends Thread {
    BlockingQueue<String> bq;

    public Consumer(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        String[] str = {"java", "spring", "MyBatis"};

            for (int i = 1; i < 10; i++) {
                System.out.println(getName() + "生产者准备生产元素");
                try {
                    Thread.sleep(200);
                    bq.put(str[i % 3]);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + "生产了元素：" + bq);
            }
    }
}
