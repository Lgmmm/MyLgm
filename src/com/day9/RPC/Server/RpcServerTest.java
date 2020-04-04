package com.day9.RPC.Server;

import com.day9.RPC.service.HelloService;
import com.day9.RPC.service.HelloServiceImpl;

/**
 * Created by lgm
 * on 2020/4/3.
 */
public class RpcServerTest {
    public static void main(String[] args) {

        Server s = new ServerCenter(9999);
        s.register(HelloService.class.getName(), HelloServiceImpl.class);
        s.start();

    }
}
