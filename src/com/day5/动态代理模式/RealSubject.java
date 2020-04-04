package com.day5.动态代理模式;

/**
 * Created by lgm
 * on 2020/3/30.
 */
public class RealSubject implements Subject {
    @Override
    public void sellBook() {
        System.out.println("开始买书");
    }
}
