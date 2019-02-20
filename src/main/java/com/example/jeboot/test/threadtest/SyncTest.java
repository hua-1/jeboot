package com.example.jeboot.test.threadtest;

public class SyncTest {


    boolean flag=false;

    public  void syncOne() throws InterruptedException {
        synchronized (SyncTest.class){
            System.out.println("第一个方法开始执行了");
            if (!flag){
                syncTwo();
            }
            flag=true;
            notify();
        }

    }

    public synchronized void syncTwo() throws InterruptedException {
            System.out.println("第二个方法开始执行了");
            if (flag){
                wait();
            }
            notify();
        System.out.println("唤醒");
    }

    public void getThree(){
        System.out.println("普通方法");
    }
}
