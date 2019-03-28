package com.example.jeboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@PropertySource(value = "classpath:config.properties",encoding = "utf-8")
@MapperScan(basePackages = {"com.example.jeboot.base","com.example.jeboot.dao"})
@EnableTransactionManagement
public class JebootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JebootApplication.class, args);
    }

}

