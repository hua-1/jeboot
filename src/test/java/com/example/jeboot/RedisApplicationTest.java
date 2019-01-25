package com.example.jeboot;

import com.example.jeboot.config.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTest {


    @Autowired
    private RedisService redisService;


    @Test
    public void addTest(){
        redisService.set("kl",2);
    }
}
