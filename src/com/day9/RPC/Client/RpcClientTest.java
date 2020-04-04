package com.day9.RPC.Client;

import com.day9.RPC.service.HelloService;

import java.net.InetSocketAddress;

/**
 * Created by lgm
 * on 2020/4/3.
 */
public class RpcClientTest {
    public static void main(String[] args) {

        Runnable rn =() -> {
            try {
                HelloService obj = Client.getRemoteProxyObj(Class.forName("com.day9.RPC.service.HelloService"), new InetSocketAddress("127.0.0.1", 9999));
                System.out.println(obj.sayHi("hahaha"));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        };
        new Thread(rn).start();

    }
}
