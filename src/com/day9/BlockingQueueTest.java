package com.day9;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by lgm
 * on 2020/4/3.
 */
public class BlockingQueueTest {
    public static void main(String[] args) {
        BlockingQueue<String> str = new ArrayBlockingQueue<String>(2);
        str.add("java");
        str.add("java2");
        System.out.println(4 % 3);
        //str.offer("java3");
    }
}
