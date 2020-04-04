package com.day5.静态代理模式;

/**
 * Created by lgm
 * on 2020/3/30.
 */
public class MainClass {
    public static void main(String[] args) {
      Subject s = new RealSubject();
      ProxySubject subject = new ProxySubject(s);
      subject.sell();
    }

}
