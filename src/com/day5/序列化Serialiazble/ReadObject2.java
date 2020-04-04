package com.day5.序列化Serialiazble;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * Created by lgm
 * on 2020/3/30.
 */
public class ReadObject2 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("object2.txt"));
        Object object = in.readObject();

       List<Object> list = ( List<Object>)in.readObject();
        for ( Object list1:list) {
            System.out.println(list1.toString());
        }


    }
}
