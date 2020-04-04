package com.day1;

/**
 * Created by lgm
 * on 2020/3/26.
 */
public class QuickSort {

    public static void main(String[] args) {

    }

    public static void quick(int[] arr, int left, int right) {
        //如果左边索引比右边索引大，是不合法的，直接return结束方法
        if (left > right) {
            return;
        }

        //定义变量保存基数
        int base = arr[left];
        //定义变量i  指向最左变
        int i = left;
        //定义变量j  指向最右边

        int j = right;

        //当i和j不相遇的时候，在循环中检索
        while (i != j) {
            //向由j从右往左检索比基准数小的，如果检索比基准数小的就停下

            //如果检索大比基准数大的或者相等，就继续检索
            while (arr[j] >= base && i < j) {
                j--;//j从右向左移动 963.*741
            }

            //i从左向右检索
            while (arr[j] <= base && i < j) {
                i++;//i从左向右移动
            }

            //代码走到这里。i跟j都停下，然后i和j位置交换
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
/*
            如果上面的while条件不成立，会跳出这个循环，往下执行。
            如果这个条件不成立说明i和j 相遇了
            如果i和j相遇了，就交换基准数这个元素和相遇位置的元素
            把相遇位置的元素赋值基准数这个位置的元素

 */
            arr[left] = arr[i];
            //把基准数赋值给相遇位置的元素
            arr[i] = base;

            quick(arr, left, i - 1);
            quick(arr, j + 1, right);


        }


    }
}
