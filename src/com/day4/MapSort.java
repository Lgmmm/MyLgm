package com.day4;

import java.util.*;

/**
 * Created by lgm
 * on 2020/3/28.
 */
public class MapSort {
    public static void main(String[] args) {
        Map<String,String> hm = new HashMap<>();
        hm.put("e","e");
        hm.put("a","a");
        hm.put("d","d");
        hm.put("c","c");
        hm.put("b","b");
        System.out.println("排序前"+hm);
        Set<Map.Entry<String, String>> set = hm.entrySet();

        ArrayList<Map.Entry<String, String>> list = new ArrayList<>(set);
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        System.out.println(list);


    }
}
