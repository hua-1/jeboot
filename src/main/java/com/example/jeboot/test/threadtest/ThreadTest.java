package com.example.jeboot.test.threadtest;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadTest {


    @Test
    public void threadTest(){
        CallableTest test=new CallableTest();
        FutureTask<Object> future = new FutureTask<Object>(test);
        new Thread(future).start();
    }
}
