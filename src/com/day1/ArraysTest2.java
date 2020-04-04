package com.day1;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.function.IntBinaryOperator;

/**
 * Created by lgm
 * on 2020/3/25.
 */
public class ArraysTest2 {
    public static void main(String[] args) {
        int[] arr={10,25,36,8,6,55};
        Arrays.parallelPrefix(arr, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                System.out.println(left+"---"+right);
                return 1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }

}
