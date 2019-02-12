package com.example.jeboot.test.threadtest;

public class ThreadA {

    public static void main(String[] args) {
        ThreadB threadB=new ThreadB();
        threadB.start();

        System.out.println("主線程"+Thread.currentThread().getName());
    }
}
