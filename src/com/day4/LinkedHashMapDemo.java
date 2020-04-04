package com.day4;

import java.util.LinkedHashMap;

/**
 * Created by lgm
 * on 2020/3/28.
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();

        map.put("语文",60);
        map.put("数学",80);
        map.put("英语",50);


        map2.put(2,"贰");
        map2.put(1,"壹");
        map2.put(3,"叁");

        map.forEach((s, integer) -> System.out.println(s+"=="+integer));
        System.out.println(map2);
    }
}
