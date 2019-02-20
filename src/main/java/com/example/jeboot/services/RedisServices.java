package com.example.jeboot.services;

import com.example.jeboot.config.RedisService;
import com.example.jeboot.dao.TCcoreIdentityMapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RedisServices {


    @Autowired
    private RedisService redisService;

    @Autowired
    private TCcoreIdentityMapper tCcoreIdentityMapper;

    public void addRedis() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        redisService.set("1", list);
    }

    public void getRedis(){
        String s = redisService.get("1");
        if (s==null){
            throw new RuntimeException("无知");
        }else {
            throw new RuntimeException("那错误值了");
        }
    }

    public void getString(String k1){
        String s = redisService.get(k1);
        if (StringUtils.isEmpty(s)){
            redisService.set(k1,200);
        }
    }
}
