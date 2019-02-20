package com.example.jeboot.test.threadtest;

public class Solution1 {
    private static Object lock = new Object();

    private static int i = 1;

    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            public void run() {
                while (i <= 10) {
                    synchronized (lock) {
                        if (i % 2 == 1) {
                            System.out.println("thread1  " + i++);
                        } else {
                            lock.notifyAll();
                            try {
                                lock.wait(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                }
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                while (i <= 10) {
                    synchronized (lock) {
                        if (i % 2 == 0) {
                            System.out.println("thread2  " + i++);
                        } else {
                            lock.notifyAll();
                            try {
                                lock.wait(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                }
            }
        };
        thread1.start();
        thread2.start();
    }

}
