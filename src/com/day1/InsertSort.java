package com.day1;

import java.util.Arrays;

/**
 * Created by lgm
 * on 2020/3/25.
 */
public class InsertSort {
    public static void main(String[] args) {
   test();
    }

    public static void test(){
        int[] arr = {17,3,25,14,20,9};

        for (int i = 1; i < arr.length; i++) {
            int insertVal = arr[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;

            }

            arr[insertIndex + 1] = insertVal;

            System.out.println("第" + i + "轮插入");
            System.out.println(Arrays.toString(arr));
        }
    }
}
