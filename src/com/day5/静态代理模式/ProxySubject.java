package com.day5.静态代理模式;

/**
 * Created by lgm
 * on 2020/3/30.
 */
public class ProxySubject implements Subject {
    private Subject s;

    public ProxySubject(Subject s) {
        this.s = s;
    }

    @Override
    public void sell() {
        sellBefore();
        s.sell();
        sellLast();

    }


    public void sellBefore(){
        System.out.println("买书之前先打折");
    }

    public void sellLast(){
        System.out.println("买完书后送会员卡");
    }
}
