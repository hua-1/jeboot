package com.example.jeboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.jeboot.base","com.example.jeboot.dao"})
public class JebootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JebootApplication.class, args);
    }

}

