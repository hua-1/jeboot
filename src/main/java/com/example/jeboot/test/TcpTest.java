package com.example.jeboot.test;

import com.sun.javafx.collections.MappingChange;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.messaging.tcp.TcpConnection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class TcpTest {


    @Test
    public void addTcp(){
        long startTime=System.currentTimeMillis();
        List<Integer> list = addList();
        List<Integer> integers = addList();
        Map<Integer,Integer> map=new HashMap<>();
        integers.forEach(e->{
            map.put(e,e);
        });
        list.stream().forEach(e->{
            map.get(e);
        });
        long endTime=System.currentTimeMillis();
        System.out.println("当前程序耗时："+(endTime-startTime)+"ms");
    }



    public List<Integer> addList(){
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<100000;i++){
            list.add((int) (Math.random()*10));
        }
        return list;
    }

    @Test
    public void getQueue(){
        Queue<Integer> queue = addQueue();

        for (int i=0;i<queue.size();i++){
            queue.peek();
        }

        System.out.println(queue.size());
    }

    public Queue<Integer> addQueue(){
        Queue<Integer> queue=new ArrayDeque<>();
       queue.add(1);
        return queue;
    }

}
