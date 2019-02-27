package com.example.jeboot.test.threadtest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

    public static void main(String[] args) {
        Lock lock=new ReentrantLock();
        lock.unlock();
    }
}
