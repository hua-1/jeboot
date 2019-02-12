package com.example.jeboot.test.threadtest;

public class ThreadB extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }
}
