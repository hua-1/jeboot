package com.example.jeboot;

import com.example.jeboot.config.RedisService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@SpringBootApplication
@MapperScan("com.example.jeboot.dao")
@EnableTransactionManagement
public class JebootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JebootApplication.class, args);
    }

    @Bean
    public RedisService service(){
        return  new RedisService();
    }
}

