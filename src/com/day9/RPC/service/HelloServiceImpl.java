package com.day9.RPC.service;

/**
 * Created by lgm
 * on 2020/4/3.
 */
public class HelloServiceImpl implements HelloService{
    @Override
    public String sayHi(String name) {
        return name;
    }
}
