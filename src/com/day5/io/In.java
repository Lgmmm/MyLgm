package com.day5.io;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by lgm
 * on 2020/3/30.
 */
public class In {
    public static void main(String[] args) {
        File f = null;
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            f = new File("Test.txt");
            in = new FileInputStream(f);
            out = new FileOutputStream(f,true);
            String s ="456\r\n";
            out.write(s.getBytes());


            if (!f.exists()) f.createNewFile();
            byte[] bytes = new byte[1024];
            int read = 0;
            while ((read = in.read(bytes)) > 0) {
                System.out.println(new String(bytes, 0, read));
            }



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }
}
