package com.day7;

import com.day5.io.In;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by lgm
 * on 2020/4/1.
 */
public class CallableDemo {
    public static void main(String[] args) {



        FutureTask task = new FutureTask<Integer>(() -> {
            int i = 0;
            for (; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "==" + i);
            }


            return i;
        });

        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"=="+i);
            if(i==20){
                new Thread(task).start();
            }
        }

        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
