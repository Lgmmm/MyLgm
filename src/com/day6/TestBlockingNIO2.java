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
 *
 *
 * Nio阻塞模式
 */
public class TestBlockingNIO2 {
    //客户端
    @Test
    public void client() throws Exception {
        //获取客户端通道
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 8899));
        System.out.println("客户端启动，准备连接8899端口....");
        //读取文件通道
        FileChannel channel = FileChannel.open(Paths.get("123.jpg"), StandardOpenOption.READ);
        ByteBuffer bst = ByteBuffer.allocate(1024);
        //读取本地文件发送客户端
        while (channel.read(bst) != -1) {
            bst.flip();
            socketChannel.write(bst);
            bst.clear();
        }
        channel.close();
        socketChannel.close();
    }

    //服务端
    @Test
    public void server() throws Exception {
        //获取通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        System.out.println("服务端启动，在8899端口监听.....");
        FileChannel channel = FileChannel.open(Paths.get("abc.jpg"), StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        //绑定端口号
        serverSocketChannel.bind(new InetSocketAddress(8899));
        //获取客户端连接
        SocketChannel acceptChannel = serverSocketChannel.accept();
       //分配指定缓冲区大小
        ByteBuffer bst = ByteBuffer.allocate(1024);
        //读取客户端信息 保存到本地
        while (acceptChannel.read(bst) != -1) {
            bst.flip();
            channel.write(bst);
            bst.clear();
        }
        serverSocketChannel.close();
        acceptChannel.close();
        channel.close();


    }
}
