package com.example.jeboot;

import com.example.jeboot.services.TCcoreIdService;
import com.example.jeboot.services.TTestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JebootApplicationTests {

    @Autowired
    private TTestService tTestService;
    @Autowired
    private TCcoreIdService tCcoreIdService;
    @Test
    public void contextLoads() {
        tCcoreIdService.batchInsert();
    }

    @Test
    public void addTest(){
        try {
            tTestService.addThread();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void threadTest(){
        Thread thread = new Thread(String.valueOf(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                System.out.println("执行了");
                return null;
            }
        }));
        thread.start();
    }

    @Test
    public void getThread(){
        tTestService.getThread();
    }
}

