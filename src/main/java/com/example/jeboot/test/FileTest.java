package com.example.jeboot.test;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileTest {
    public static void main(String[] args) {

    }


    public void test(InputStream inputStream) throws IOException {

        File file=new File("");
        FileInputStream channel= new FileInputStream(file);
        FileChannel channel1 = channel.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1024);
        long start = System.currentTimeMillis();
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        while(true)
        {
            int eof = channel1.read(byteBuffer);
            if(eof == -1 ) break;
            byteBuffer.flip();
            output.write(byteBuffer.array());
            byteBuffer.clear();
        }
        System.out.println("spending : " + (System.currentTimeMillis()-start));
    }
}
