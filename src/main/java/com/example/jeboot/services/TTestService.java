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
    ExecutorService exec= Executors.newCachedThreadPool();

    public void addAll(){
        TTest tTest=new TTest();
        tTest.settName("测试并发数");
        List list=new ArrayList();
        list.add(tTest);
        tTestMapper.insertSelective(tTest);

    }

    public void addThread() throws ExecutionException, InterruptedException {
        TTest tTest=new TTest();
        tTest.settName("测试并发数");
        List list=new ArrayList();
        list.add(tTest);
        Callable callable=new Callable() {
            @Override
            public Object call() throws Exception {
                tTestMapper.batchList(list);
                return null;
            }
        };
        Future<Object> submit = (Future<Object>) exec.submit(new Runnable() {
            @Override
            public void run() {
                tTestMapper.selectByPrimaryKey(64L);
            }
        });
        submit.cancel(true);
        Object o = submit.get();

        exec.shutdown();
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


}
