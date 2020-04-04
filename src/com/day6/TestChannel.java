package com.day6;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


/**
 * Created by lgm
 * on 2020/3/31.
 */
public class TestChannel {
    public static void main(String[] args) throws Exception {


    }

    @Test
    public void test5()throws Exception{
        Charset gbk = Charset.forName("GBK");
        //获取编码器
        CharsetEncoder encoder = gbk.newEncoder();
        //获取解码器
        CharsetDecoder decoder = gbk.newDecoder();

        CharBuffer allocate = CharBuffer.allocate(1024);
        String str = "你好世界";
        allocate.put(str);
        allocate.flip();
     /*   char[] dst = new char[1024];
        allocate.get(dst,0,allocate.limit());
        System.out.println(new String(dst, 0, allocate.limit()));*/

        //编码
        ByteBuffer byteBuffer = encoder.encode(allocate);
        byte [] dst = new byte[byteBuffer.limit()];
        byteBuffer.get(dst,0,byteBuffer.limit());
        System.out.println(new String(dst, 0, byteBuffer.limit()));

        //解码
        byteBuffer.flip();
        CharBuffer charBuffer = decoder.decode(byteBuffer);
        System.out.println(charBuffer.toString());
//        char[] dst1 = new char[1024];
//        charBuffer.get(dst1,0,charBuffer.limit());
//        System.out.println(new String(dst1, 0, charBuffer.limit()));

        byteBuffer.flip();
        System.out.println("------------");
        Charset charset = Charset.forName("UTF-8");
        CharBuffer charBuffer1 = charset.decode(byteBuffer);
        System.out.println(charBuffer1.toString());
    }

    //分散和聚集
    @Test
    public void tset4() throws Exception {
        RandomAccessFile accessFile = new RandomAccessFile("1.txt", "rw");
        //获取通道
        FileChannel channel = accessFile.getChannel();

        //分配指定大小的缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(100);
        ByteBuffer buffer1 = ByteBuffer.allocate(1024);

        //分散读取
        ByteBuffer[] bufs = {buffer, buffer1};
        channel.read(bufs);

        for (ByteBuffer bufs1 : bufs) {
            bufs1.flip();
        }
        System.out.println(bufs[0].array());
        System.out.println(new String(bufs[0].array(), 0, bufs[0].limit()));
        System.out.println(new String(bufs[1].array(), 0,bufs[1].limit()));

        //聚集

        RandomAccessFile accessFile1 = new RandomAccessFile("3.txt", "rw");
        FileChannel channel1 = accessFile1.getChannel();
        channel1.write(bufs);


    }

    //通道之间数据的传输
    @Test
    public void test3() throws Exception {
        FileChannel inChannel = FileChannel.open(Paths.get("123.jpg"), StandardOpenOption.READ);
        FileChannel outChannel = FileChannel.open(Paths.get("23.jpg"), StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);

        inChannel.transferTo(0, inChannel.size(), outChannel);

        inChannel.close();
        outChannel.close();
    }

    @Test
    public void test2() throws Exception {
        //直接缓冲区
        FileChannel inChannel = FileChannel.open(Paths.get("123.jpg"), StandardOpenOption.READ);
        FileChannel outChannel = FileChannel.open(Paths.get("789.jpg"), StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);
        //内存映射文件
        MappedByteBuffer inMappedBuffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());
        MappedByteBuffer outmappedByteBuffer = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, inChannel.size());
        //直接对缓冲区进行数据读写操作
        byte[] dst = new byte[inMappedBuffer.limit()];
        inMappedBuffer.get(dst);
        outmappedByteBuffer.put(dst);

        inChannel.close();
        outChannel.close();


    }

    public void test1() throws Exception {
        //非直接缓冲区
        FileInputStream in = new FileInputStream("123.jpg");
        FileOutputStream out = new FileOutputStream("456.jpg");
        //获取通道
        FileChannel inChannel = in.getChannel();
        FileChannel outChannel = out.getChannel();

        //缓冲区
        ByteBuffer buf = ByteBuffer.allocate(1024);

        while (inChannel.read(buf) != -1) {
            buf.flip();
            outChannel.write(buf);
            buf.clear();
        }
        in.close();
        out.close();
        inChannel.close();
        outChannel.close();
    }
}
