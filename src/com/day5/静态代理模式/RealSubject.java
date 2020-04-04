package com.day5.静态代理模式;

/**
 * Created by lgm
 * on 2020/3/30.
 */
public class RealSubject implements Subject{
    @Override
    public void sell() {
        System.out.println("开始买书");
    }
}
