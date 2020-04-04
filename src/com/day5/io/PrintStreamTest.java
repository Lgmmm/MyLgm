package com.day5.io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;

/**
 * Created by lgm
 * on 2020/3/30.
 */
public class PrintStreamTest {
    public static void main(String[] args) throws Exception{
        FileOutputStream out = new FileOutputStream("demo.txt");
        PrintStream ps =new PrintStream(out);
        ps.print("nihao ");
        ps.println("你好啊啊====123");
        ps.println(new PrintStreamTest());
    }
}
