package com.example.jeboot.test.queue;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.http.client.utils.DateUtils;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        String format = DateFormatUtils.format(new Date(), "yyyy-MM-dd");


        System.out.println(format);
        Date date = new Date();
        Date date1 = DateUtils.parseDate(format,new String[]{"yyyy-MM-dd"});
        System.out.println(date1);
    }

    public static int removeDuplicates(int[] nums) {

        int number=0;
        for (int i=0;i<nums.length;i++){

            if (nums[i]!=nums[number]){
                number++;
                nums[number]=nums[i];
            }
        }
        return ++number;
    }

    public int getNumer(){
        int i=0;
        i++;
        return i;
    }

    @Test
    public void numBer(){
        int numer = getNumer();
        System.out.println(numer);
    }
}
