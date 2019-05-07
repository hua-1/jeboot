package com.example.jeboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.example.jeboot.dao")
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = "com.example.jeboot",excludeName = "com.example.jeboot.services")
public class JebootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JebootApplication.class, args);
    }

}

