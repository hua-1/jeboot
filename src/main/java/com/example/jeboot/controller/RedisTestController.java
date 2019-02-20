package com.example.jeboot.controller;

import com.example.jeboot.services.RedisServices;
import com.example.jeboot.services.TCcoreIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RedisTestController {

    @Autowired
    TCcoreIdService tCcoreIdService;

    @Autowired
    private RedisServices redisServices;
    @RequestMapping(value = "/tcAdd",method = RequestMethod.POST)
    public void add(){
        tCcoreIdService.batchInsert();
    }

    @RequestMapping(value = "/tredis",method = RequestMethod.POST)
    public void addRedis(){
        redisServices.addRedis();
    }

    @RequestMapping(value = "/getRedis",method = RequestMethod.GET)
    public void getRedis(HttpServletRequest request){
        redisServices.getRedis();
    }


    public void getSetMan(){
        redisServices.getString("k1");
    }
}
