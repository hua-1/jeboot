package com.example.jeboot.test.threadtest;

public class InterruptExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread2 = new MyThread2();
        thread2.start();
        thread2.interrupt();
        System.out.println(thread2.isAlive());
        System.out.println(thread2.isInterrupted());
    }

    private static class MyThread2 extends Thread {
        @Override
        public void run() {
            while (interrupted()) {
                // ..
                System.out.println(123);
            }
            System.out.println("Thread end");
        }
    }
}
