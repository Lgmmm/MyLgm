package com.day1;

import java.util.Arrays;

/**
 * Created by lgm
 * on 2020/3/25.
 */
public class InsertSort2 {

    public static void main(String[] args) {
        sort();

    }


    public  static void sort(){
        int [] arr = {46,36,8,15,6,5,1};
        for(int i =1;i<arr.length;i++){
            int value =arr[i];
            int index = i-1;
            while(index >= 0 && value < arr[index] ){
                arr[index+1] = arr[index];
                index --;
            }

            arr[index+1] = value;

            System.out.println("第"+i+"趟排序"+ Arrays.toString(arr));

        }


    }

    public static void test(){

        int a=0;
        int b;

    }

}

