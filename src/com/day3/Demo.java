package com.day3;

/**
 * Created by lgm
 * on 2020/3/27.
 */
public class Demo {
    public static void main(String[] args) {
        Eat person = new EatPerson();
        Eat person2 = new EatPerosn2();
        person.statr();
        person2.statr();
//        FinalClass f = new FinalClass(12, 13);
//        f.no = 20;

        int i = 128;
        Integer i2 = 128;
        Integer i3 = new Integer(128);
        System.out.println(i == i2); //Integer会自动拆箱为int，所以为true
        System.out.println(i == i3); //true，理由同上
        Integer i4 = 127;//编译时被翻译成：Integer i4 = Integer.valueOf(127);
        Integer i5 = 127;
        System.out.println(i4 == i5);//true
        Integer i6 = 128;
        Integer i7 = 128;
        System.out.println(i6 == i7);//false
        Integer i8 = new Integer(127);
        System.out.println(i5 == i8); //false
        Integer i9 = new Integer(128);
        Integer i10 = new Integer(123);
        System.out.println(i9 == i10);  //false




    }
}
