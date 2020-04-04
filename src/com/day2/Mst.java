package com.day2;

import java.util.Arrays;

/**
 * Created by lgm
 * on 2020/3/27.
 */
public class Mst {
    public static void main(String[] args) {

        int i=1;
        String str= "hello";
        Integer num= 400;
        int [] arr = {1,2,3,4,5};
        MyData myData = new MyData();

        change(i,str,num,arr,myData);


        System.out.println(i);
        System.out.println(str);
        System.out.println(num);
        System.out.println(Arrays.toString(arr));
        System.out.println(myData.a);
    }

    public static  void change(int a,String s,Integer b,int[] c,MyData m){
        a += 1;
        s += "world";
        b +=1;
        c[0] += 1;
        m.a += 1;

    }
}


class MyData{
    int a= 10;
}