package com.example.jeboot.test.threadtest;

import java.util.concurrent.Callable;

public class CallableTest implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        System.out.println("执行了");
        return null;
    }
}
