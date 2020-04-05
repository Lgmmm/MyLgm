package day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by lgm
 * on 2020/4/5.
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("1.txt");
        FileOutputStream out = new FileOutputStream("5.txt");

        FileChannel inChannel = in.getChannel();
        FileChannel outChannel = out.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int len = 0;
        while ((len = inChannel.read(buffer)) != -1) {
            buffer.flip();
            outChannel.write(buffer);
            buffer.clear();
        }

        inChannel.close();
        out.close();
    }
}
