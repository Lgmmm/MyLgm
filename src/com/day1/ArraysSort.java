package com.day1;

import java.util.Arrays;

/**
 * Created by lgm
 * on 2020/3/25.
 */
public class ArraysSort {

    public static void main(String[] args) {
        int [] arr = {15,36,12,88,66,8};

        for(int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
//      数组翻转
        for(int i =0;i<arr.length/2;i++){
             int temp = arr[i];
             arr[i] = arr[arr.length-1-i];
             arr[arr.length-1-i] = temp;

        }





        System.out.println(Arrays.toString(arr));
    }
}
