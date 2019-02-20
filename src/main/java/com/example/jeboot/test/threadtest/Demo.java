package com.example.jeboot.test.threadtest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        System.out.println(isContainChinese("0352 88888888"));
    }

    public static boolean isContainChinese(String str) {

        Pattern p = Pattern.compile("^[0-9]\\d{2} \\d{7}|^[0-9]\\d{3}-\\d{8}|^[0-9]\\d{3} \\d{8}");
        Matcher m = p.matcher(str);
        if (m.matches()) {
            return true;
        }
        return false;

    }
}
