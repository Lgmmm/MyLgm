package com.day9;

import org.junit.Test;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.util.HashMap;

/**
 * Created by lgm
 * on 2020/4/4.
 */
public class Demo {

    public static void main(String[] args) {

    }
    //服务端
    @Test
    public void server() throws Exception{
        ServerSocketChannel server = ServerSocketChannel.open();
        server.bind(new InetSocketAddress(8686));
        SocketChannel sa = server.accept();


        ByteBuffer bf = ByteBuffer.allocate(1024);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");


        bf.flip();
        sa.write();
        bf.clear();

        server.close();
        sa.close();

    }
    //客户端
        @Test
    public void client()throws Exception{
        SocketChannel open = SocketChannel.open(new InetSocketAddress("127.0.0.1", 8686));

        ByteBuffer bf = ByteBuffer.allocate(1024);
        int len =0;
        while((len = open.read(bf)) != -1){
            bf.clear();
            System.out.println(new String (bf.array(),0,len));
            bf.clear();
        }
            open.close();

    }
}
