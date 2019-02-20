package com.example.jeboot.services;

import com.example.jeboot.dao.TTestMapper;
import com.example.jeboot.entity.TTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@Service
public class TTestService {

    @Autowired
    private TTestMapper tTestMapper;
    ExecutorService exec= Executors.newSingleThreadExecutor();

    public void addAll(){
        TTest tTest=new TTest();
        tTest.settName("测试并发数");
        List list=new ArrayList();
        list.add(tTest);
        tTestMapper.insertSelective(tTest);

    }

    public void addThread() throws ExecutionException, InterruptedException {
        CountDownLatch begin = new CountDownLatch(1);
        TTest tTest=new TTest();
        tTest.settName("测试并发数123");
        List<Future> list1=new ArrayList<>();
        for (int i=0;i<5;i++){
            Future<Object> submit = exec.submit(new Callable<Object>() {
                @Override
                public Object call() throws Exception {
                    tTestMapper.insert(tTest);
                    return null;
                }
            });

            list1.add(submit);
        }
        for (Future f:list1){
            System.out.println(f.get());
        }

    }

    @Test
    public void threadTest(){
        exec.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                System.out.println("执行了");
                return null;
            }
        });
    }

    public void getThread(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                TTest tTest = tTestMapper.selectByPrimaryKey(64L);
            }
        }).start();

    }

    @Test
    public void threadInter() throws InterruptedException {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("方法執行了");
            }
        });
        thread.start();
        Thread.sleep(3000L);
        thread.interrupt();
        System.out.println(thread.isAlive());
        Thread.sleep(3000L);

    }

}
