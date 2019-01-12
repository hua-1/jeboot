package com.example.jeboot;

import com.example.jeboot.services.TCcoreIdService;
import com.example.jeboot.services.TTestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
        tTestService.addAll();
    }

}

