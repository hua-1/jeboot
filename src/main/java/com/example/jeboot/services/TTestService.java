package com.example.jeboot.services;

import com.example.jeboot.dao.TTestMapper;
import com.example.jeboot.entity.TTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TTestService {

    @Autowired
    private TTestMapper tTestMapper;


    public void addAll(){
        List<TTest> list=new ArrayList<>();
        for (int i=0;i<20;i++){
            TTest tTest=new TTest();
            tTest.settName("2");
            list.add(tTest);
        }
        tTestMapper.batchList(list);
    }
}
