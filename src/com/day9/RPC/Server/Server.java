package com.day9.RPC.Server;

/**
 * Created by lgm
 * on 2020/4/3.
 */
public interface Server {
    void start();
    void stop();
    void register(String serviceName,Class serviceImpl);
}
