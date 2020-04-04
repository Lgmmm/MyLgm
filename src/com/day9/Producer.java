package com.day9;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by lgm
 * on 2020/4/3.
 */
public class Producer extends Thread {
    BlockingQueue<String> bq;

    public Producer(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {

            while(true){
                System.out.println("消费者准备消费集合元素");
                try {
                    Thread.sleep(200);
                    bq.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(getName()+"消费了元素"+bq);
            }
        }



    public static void main(String[] args) {

           BlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

           Consumer con1 = new Consumer(queue);
           Consumer con2 = new Consumer(queue);
           Consumer con3 = new Consumer(queue);

           con1.start();
           con2.start();
           con3.start();
           Producer pro = new Producer(queue);
           pro.start();

    }
}
