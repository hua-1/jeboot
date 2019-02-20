package com.example.jeboot.test.threadtest;

public class MyThread12 extends Thread {
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("i = " + i);
        }
    }
}
