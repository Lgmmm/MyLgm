package com.day6;

import java.nio.ByteBuffer;
import java.sql.SQLOutput;

/**
 * Created by lgm
 * on 2020/3/31.
 * buffer:缓冲区
 * channel：通道
 */
public class TestBuffer {
    public static void main(String[] args) {
        System.out.println("-------创建一个容量为allocate的缓冲区--------");
        ByteBuffer bf = ByteBuffer.allocate(1024);//创建一个容量为allocate的缓冲区
        System.out.println("容量="+bf.capacity());//容量
        System.out.println("界限="+bf.limit());//界限
        System.out.println("位置="+bf.position());//位置

        System.out.println("-------放入abcd数据--------");
        String str ="abcd";
        bf.put(str.getBytes());//放入数据
        System.out.println("容量="+bf.capacity());//容量
        System.out.println("界限="+bf.limit());//界限
        System.out.println("位置="+bf.position());//位置

        System.out.println("------进入读数据模式---------");
        bf.flip();//进入读数据模式
        System.out.println("容量="+bf.capacity());//容量
        System.out.println("界限="+bf.limit());//界限
        System.out.println("位置="+bf.position());//位置


        System.out.println("-------读完数据之后--------");
        byte[] b = new byte[bf.limit()];
        bf.get(b, 0, bf.limit());
        System.out.println(new String(b, 0, bf.limit()));
        System.out.println("容量="+bf.capacity());//容量
        System.out.println("界限="+bf.limit());//界限
        System.out.println("位置="+bf.position());//位置

        System.out.println("------clear()方法---------");
        bf.clear();
        System.out.println("容量="+bf.capacity());//容量
        System.out.println("界限="+bf.limit());//界限
        System.out.println("位置="+bf.position());//位置
    }
}
