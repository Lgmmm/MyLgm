package com.day5.序列化Serialiazble;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by lgm
 * on 2020/3/30.
 */
public class ReadObject {
    public static void main(String[] args) throws Exception{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.txt"));
        Person o =(Person) in.readObject();
        System.out.println(o);
    }
}
