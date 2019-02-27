package com.example.jeboot.test.threadtest;

import java.util.concurrent.locks.Lock;

public class TwinsLockTest {
    public void test() throws InterruptedException {
        final Lock lock = new TwinsLock();
        class Worker extends Thread {
            public void run() {
                while (true) {
                    lock.lock();
                    try {
                        Thread.sleep(1000L);
                        System.out.println(Thread.currentThread().getName());
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }
        // 启动10个线程
        for (int i = 0; i < 10; i++) {
            Worker w = new Worker();
            w.setDaemon(true);
            w.start();
        }
        // 每隔1秒换行
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000L);
            System.out.println();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new TwinsLockTest().test();
    }
}
