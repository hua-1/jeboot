package com.example.jeboot.test.threadtest;

public class t12 {
    public static void main(String[] args) {
        try {
            MyThread12 thread = new MyThread12();
            thread.start();
            Thread.sleep(500);
            thread.interrupt();
//            System.out.println("是否终止1？ =" + Thread.interrupted());
            System.out.println("是否终止2？ =" + thread.isInterrupted());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("-------------end-------------");
    }
}
