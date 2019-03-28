package com.example.jeboot.controller;

import com.example.jeboot.services.TTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransTest {

    @Autowired
    private TTestService tTestService;


    @GetMapping("trA")
    public void trA() throws Exception {
        tTestService.trA();
    }

    @GetMapping("trB")
    public void trB() throws Exception {
        tTestService.trB();
    }

    @GetMapping("trC")
    public void trC() throws Exception {
        tTestService.trC();
    }


    @GetMapping("trD")
    public void trD() throws Exception {
        tTestService.trD();
    }
}
