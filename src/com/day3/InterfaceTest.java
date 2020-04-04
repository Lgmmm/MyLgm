package com.day3;

/**
 * Created by lgm
 * on 2020/3/27.
 */
public class InterfaceTest implements MyInterface{
    String age ="15";
    @Override
    public void say() {

    }

    public static void main(String[] args) {
        MyInterface interfaceTest = new InterfaceTest();
        System.out.println(interfaceTest.AGE);
    }
}
