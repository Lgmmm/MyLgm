package com.day6;

import org.junit.Test;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by lgm
 * on 2020/3/31.
 * <p>
 * <p>
 * Nio阻塞模式
 */
public class TestBlockingNIO {
    //客户端
    @Test
    public void client() throws Exception {
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 5566));
        System.out.println("我是客户端");
        FileChannel channel = FileChannel.open(Paths.get("123.jpg"), StandardOpenOption.READ);

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        while (channel.read(byteBuffer) != -1) {
            byteBuffer.flip();
            socketChannel.write(byteBuffer);
            byteBuffer.clear();
        }

        socketChannel.shutdownOutput();
        //接收服务端反馈
        int len = 0;
        while ((len = socketChannel.read(byteBuffer)) != -1) {
            byteBuffer.flip();
            System.out.println(new String(byteBuffer.array(),0,len));
            byteBuffer.clear();
        }
        socketChannel.close();
        channel.close();

    }

    //服务端
    @Test
    public void server() throws Exception {

        ServerSocketChannel socketChannel = ServerSocketChannel.open();
        System.out.println("我是服务端，在5566端口监听");
        FileChannel open = FileChannel.open(Paths.get("ll.jpg"), StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        socketChannel.bind(new InetSocketAddress(5566));
        SocketChannel accept = socketChannel.accept();

        ByteBuffer allocate = ByteBuffer.allocate(1024);
        while (accept.read(allocate) != -1) {
            allocate.flip();
            open.write(allocate);
            allocate.clear();
        }
        //发送反馈
        ByteBuffer put = allocate.put("服务端接收成功".getBytes());
        allocate.flip();
        accept.write(put);
        allocate.clear();


        socketChannel.close();
        open.close();
        accept.close();

    }
}
