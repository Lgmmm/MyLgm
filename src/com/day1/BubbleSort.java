package com.day1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lgm
 * on 2020/3/25.
 */
public class BubbleSort {
    //冒泡排序 o(n^2)
    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] arr = new int[80000];
        for(int i =0; i<arr.length;i++){
            arr[i] = (int)(Math.random()*8000);
        }

        sort.bubble(arr);

    }

    public void bubble(int [] arr){
        Date date = new Date();
        SimpleDateFormat sm = new SimpleDateFormat("yy-MM-dd : hh:MM:ss");
        System.out.println(sm.format(date));

        for(int i =0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-1-i;j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }



        Date date2 = new Date();
        SimpleDateFormat sm2 = new SimpleDateFormat("yy-MM-dd : hh:MM:ss");
        System.out.println(sm2.format(date2));
    }
}
