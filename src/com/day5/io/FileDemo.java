package com.day5.io;

import java.io.File;
import java.util.Arrays;

/**
 * Created by lgm
 * on 2020/3/30.
 */
public class FileDemo {
    public static void main(String[] args) throws Exception {
        File f = new File("Test.txt");
        System.out.println(f.getCanonicalPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getParent());
        if(!f.exists()){
            f.createNewFile();
        }

        File f2 = new File("E:\\daima");
        String[] list = f2.list();
        System.out.println(Arrays.toString(list));

    }
}
