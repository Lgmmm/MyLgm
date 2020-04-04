package com.day5.序列化Serialiazble;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Created by lgm
 * on 2020/3/30.
 * 普通类型序列化
 */
public class WriteObject {

    public static void main(String[] args) throws Exception{
        ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("object.txt"));
        Person person = new Person(12,"aa");
        out.writeObject(person);
        out.close();
    }
}
