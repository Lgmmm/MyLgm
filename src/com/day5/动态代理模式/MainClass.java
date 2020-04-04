package com.day5.动态代理模式;

import java.lang.reflect.Proxy;

/**
 * Created by lgm
 * on 2020/3/30.
 */
public class MainClass {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        MyHandler handler = new MyHandler(subject);


        Subject s=(Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(), subject.getClass().getInterfaces(), handler);
        s.sellBook();
    }
}
