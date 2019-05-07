package com.example.jeboot.fastdfs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/order")
public class RequestController {



    @GetMapping(value = "/testOrder")
    public void testOrder(HttpServletRequest request){

        String requestId = request.getParameter("requestId");
        System.out.println(requestId);
    }
}
