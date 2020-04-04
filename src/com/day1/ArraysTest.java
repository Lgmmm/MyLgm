package com.day1;

import javax.xml.transform.sax.SAXSource;
import java.util.Arrays;

/**
 * Created by lgm
 * on 2020/3/25.
 */
public class ArraysTest {
    public static void main(String[] args) {

        //数组是一种数据类型结构，数组引用变量存放在栈内存（实际存放的为内存地址），数组存放的对象内容放在堆内存。
        //Arrays是一个数组的辅助工具类，具有对数组的遍历，复制，查找等方法
        int [] a = new int []{3,4,5,6};
        int[] a2 = new int[]{7,4,5,6};
        System.out.println("a数组与a2数组是否相等"+ Arrays.equals(a,a2));

        int [] b = Arrays.copyOf(a,6);
        System.out.println("a数组与b数组是否相等"+Arrays.equals(a,b));

        System.out.println(Arrays.toString(a2));

    }
}
