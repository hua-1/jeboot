package com.example.jeboot.test.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue=new ArrayBlockingQueue(1);
        queue.add(1);
    }
}
