package com.day6.nio非阻塞;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;
import java.util.Iterator;

/**
 * Created by lgm
 * on 2020/4/2.
 * 非阻塞
 * 服务器向客户端传输照片
 */
public class NoBlockingNio {
    //服务端
    @Test
    public void testServer() {
        try {
            //获取通道
            ServerSocketChannel sschannel = ServerSocketChannel.open();

            //切换非阻塞模式
            sschannel.configureBlocking(false);

            //绑定连接
            sschannel.bind(new InetSocketAddress(8899));

            //获取选择器
            Selector selector = Selector.open();

            //将通道注册到选择器,并指定监听接收事件
            sschannel.register(selector, SelectionKey.OP_ACCEPT);

            //轮询式获取选择器上已经准备就绪的事件
            while (selector.select() > 0) {
                //获取当前选择器中所有注册的‘选择键’（已就绪的监听事件）
                Iterator<SelectionKey> it = selector.selectedKeys().iterator();
                while (it.hasNext()) {
                    //获取准备‘就绪’的事件
                    SelectionKey sk = it.next();

                    //判断具体是什么事件就绪
                    //测试此密钥的通道是否已准备好接受新的套接字连接
                    if (sk.isAcceptable()) {
                        //若‘接收就绪’，获取客户端连接
                        SocketChannel sChannel = sschannel.accept();
                        //切换非阻塞模式
                        sChannel.configureBlocking(false);
                        //将该通道注册到选择器上
                        sChannel.register(selector, SelectionKey.OP_READ);
                        //测试此密钥的频道是否可以阅读。
                    } else if (sk.isReadable()) {
                        //获取当前选择器上‘读就绪’状态的通道
                        SocketChannel sChannel = (SocketChannel) sk.channel();
                        //读数据
                        ByteBuffer buf = ByteBuffer.allocate(1024);

                        int len = 0;
                        while ((len = sChannel.read(buf)) != -1) {
                            buf.flip();
                            System.out.println(new String(buf.array(), 0, len));
                            buf.clear();
                        }
                    }
                    //取消选择器
                    it.remove();
                }

            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

        }


    }

    //客户端
    @Test
    public void testClient() {
        try {
            //获取通道
            SocketChannel sChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 8899));

            //切换非阻塞模式，默认是阻塞模式
            sChannel.configureBlocking(false);

            //分配缓冲区
            ByteBuffer buf = ByteBuffer.allocate(1024);

            //发送数据给服务端
            buf.put((new Date().toString()).getBytes());
            buf.flip();
            sChannel.write(buf);
            buf.clear();

            //关闭通道
            sChannel.close();

        } catch (Exception e) {

        } finally {

        }


    }
}
