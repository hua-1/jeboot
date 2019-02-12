package com.example.jeboot.test;

import org.junit.jupiter.api.Test;

import java.util.Vector;
import java.util.regex.Pattern;

public class TakeDieTest {



    @Test
    public void test(){
        long a=9527;
        long b=6;
        Long l = a % 64;
        System.out.println(l);
    }

    @Test
    public void xiaoshuo(){
        final Pattern DECIMAL_PATTERN = Pattern.compile("^([0-9][0-9]*)+(.[0-9]{1,4})?$");
        String a="0";

        boolean matches = DECIMAL_PATTERN.matcher(a).matches();
        System.out.println(matches);

    }
    @Test
   public   void method() {
        Vector vector = new Vector();
        for (int i = 1; i<1000; i++){
            Object object = new Object();
            vector.add(object);
            object = null;
        }
        //...对vector的操作
        vector.forEach(e->{
            System.out.println(e);
        });
    }
}



