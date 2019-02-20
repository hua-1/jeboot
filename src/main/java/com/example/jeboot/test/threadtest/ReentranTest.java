package com.example.jeboot.test.threadtest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentranTest {

    final Lock lock=new ReentrantLock();
    public void get(){
        lock.lock();
        System.out.println("开始"+Thread.currentThread().getName());
        lock.unlock();
    }
}
