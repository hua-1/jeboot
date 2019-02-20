package com.example.jeboot.test.threadtest;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SyncMain {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch downLatch=new CountDownLatch(2);

        for (int i=0;i<3;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {

                    System.out.println("yy"+Thread.currentThread().getName());
                }

            }).start();
            downLatch.countDown();
            System.out.println(i);
        }
        downLatch.await();
        System.out.println("zhi");
    }
}
