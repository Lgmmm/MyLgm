package com.day4;

import java.util.HashMap;

/**
 * Created by lgm
 * on 2020/3/28.
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap();
        HashMap<Integer,String> hm2 = new HashMap();
        hm.put(1,"a");
        hm.put(2,"b");
        hm.put(3,"c");
        hm.put(4, "b");
        for(Integer it : hm.keySet()){
            System.out.println(it);
            String value = hm.get(it);
            if(!hm2.containsValue(value)){
                hm2.put(it,value);
            }
        }

        System.out.println(hm);
        System.out.println("----------");
        System.out.println(hm2);
    }
}
