package com.day6.nio阻塞;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by lgm
 * on 2020/4/2.
 * 服务器向客户端传输照片
 */
public class BlockingNio {
    //服务端
    @Test
    public void testServer() {
        try{
            ServerSocketChannel open = ServerSocketChannel.open();
            ServerSocketChannel ss = open.bind(new InetSocketAddress(5588));
            SocketChannel accept = ss.accept();

            FileChannel channel = FileChannel.open(Paths.get("123.jpg"), StandardOpenOption.READ);

            ByteBuffer bf = ByteBuffer.allocate(1024);
            while (channel.read(bf) != -1) {
                bf.flip();
                accept.write(bf);
                bf.clear();
            }
            open.close();
            accept.close();
            channel.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {

        }


    }
    //客户端
    @Test
    public void testClient() {
        try{
            SocketChannel socket = SocketChannel.open(new InetSocketAddress("127.0.0.1", 5588));

            FileChannel open1 = FileChannel.open(Paths.get("88.jpg"), StandardOpenOption.WRITE, StandardOpenOption.CREATE);

            ByteBuffer bf = ByteBuffer.allocate(1024);

            while (socket.read(bf) != -1) {
                bf.flip();
                open1.write(bf);
                bf.clear();
            }
            socket.close();
            open1.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {

        }




    }
}
