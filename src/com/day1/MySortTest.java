package com.day1;

import java.util.Arrays;

/**
 * Created by lgm
 * on 2020/3/25.
 */
public class MySortTest {


    public static void main(String[] args) {
        int[] arr = {15, 36, 48, 2, 3, 9, 5};

        bubbleSort2(arr);
        selectSort2(arr);
        insertSort2(arr);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("冒泡排序" + Arrays.toString(arr));

    }
    public static  void bubbleSort2(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;

                }

            }
        }


        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {

        int min = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }

            }

            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

        }

        System.out.println("选择排序；"+Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {


        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int index = i - 1;

            while (index >= 0 && value < arr[index]) {
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index + 1] = value;
        }

        System.out.println("插入排序"+Arrays.toString(arr));

    }







    public static void selectSort2(int[] arr){

    int min =0;
    for(int i =0;i<arr.length-1;i++) {
        min = i;
        for(int j = i+1;j<arr.length;j++){
            if(arr[min]>arr[j]){
                min = j;
            }
        }
        if(i!=min){
            int temp =arr[i];
            arr[i]= arr[min];
            arr[min]=temp;
        }


        }
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort2(int[] arr){

        for(int i =1;i<arr.length;i++){
            int value = arr[i];
            int index = i-1;

            while (i>=0 && value <arr[index]){
                arr[index+1] =arr[index];
                index--;
            }

            arr[index+1] = value;

        }
        System.out.println(Arrays.toString(arr));
    }
}
