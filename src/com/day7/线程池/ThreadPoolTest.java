package com.day7.线程池;

import java.util.concurrent.*;

/**
 * Created by lgm
 * on 2020/4/1.
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 5,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
        executor.submit(() -> {

        });

        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(() -> {
            for(int i = 0;i<50;i++){
                System.out.println(Thread.currentThread().getName()+"=="+i);
            }

        });

//        Runnable run =() -> {
//            for(int i = 0;i<50;i++){
//                System.out.println(Thread.currentThread().getName()+"=="+i);
//            }
//        };
//        pool.submit(run);
//        pool.submit(run);
        pool.shutdown();

    }
}
