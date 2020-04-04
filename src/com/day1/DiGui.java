package com.day1;

/**
 * Created by lgm
 * on 2020/3/26.
 */
public class DiGui {
    public static void main(String[] args) {

    }

    public Integer run(int n) {
        if (n == 1) {
            return 10;
        } else return run(n - 1) + 2;
    }

    //斐波那契数列长这个样子：{1 1 2 3 5 8 13 21 34 55..... n }

    public Integer get(int n) {
        if (n == 1 || n == 2) return 1;
        return get(n - 2) + get(n - 1);

    }

    //递归数组内部的最大值

    public int max(int[] arr, int left, int right) {
        //如果该数组只有一个数，那么最大的就是该数组第一个值了
        if (left == right) {
            return arr[left];
        }
        int a = arr[left];
        int b = max(arr, left + 1, right);//找出整体的最大值
        return a > b ? a : b;


    }

    public int get2(int n){

        if(n ==1 && n==2){
            return n;
        }

        return get2(n-2)+get2(n-1);
    }
}
