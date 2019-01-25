package com.example.jeboot.controller;

import com.example.jeboot.services.TCcoreIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisTestController {

    @Autowired
    TCcoreIdService tCcoreIdService;

    @RequestMapping(value = "/tcAdd",method = RequestMethod.POST)
    public void add(){
        tCcoreIdService.batchInsert();
    }
}
