package com.day4;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.HashMap;

/**
 * Created by lgm
 * on 2020/3/28.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();


        map.put(2,"贰");
        map.put(1,"壹");
        map.put(3,"叁");

        map2.put("贰",2);
        map2.put("壹",1);
        map2.put("叁",1);

        //map的key是有序
        System.out.println(map);
        System.out.println(map2);

    }
}

