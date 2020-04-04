package com.day5.动态代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lgm
 * on 2020/3/30.
 */
public class MyHandler<T> implements InvocationHandler {

    private T t;

    public MyHandler(T t) {
        this.t =t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName());
        sellBefore();
        Object o = method.invoke(t, args);
        sellLast();
        return o;
    }

    public void sellBefore(){
        System.out.println("买书之前先打折");
    }

    public void sellLast(){
        System.out.println("买完书后送会员卡");
    }
}
