package com.day1;

/**
 * Created by lgm
 * on 2020/3/26.
 */
public class MianShiTi {
    static int  s;
    int i;
    int j;
    {
        int i =1;
        i++;
        j++;
        s++;
    }

    public void test(int j){
        j++;
        i++;
        s++;
    }

    public static void main(String[] args) {
        MianShiTi m = new MianShiTi();
        MianShiTi m2 = new MianShiTi();

        m.test(10);
        m.test(20);
        m2.test(30);

        System.out.println(m.i+"--"+m.j+"--"+m.s);
        System.out.println(m2.i+"--"+m2.j+"--"+m2.s);
    }
}
