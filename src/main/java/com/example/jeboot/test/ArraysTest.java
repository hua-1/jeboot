package com.example.jeboot.test;

import org.junit.jupiter.api.Test;

import java.util.*;

public class ArraysTest {

    public static void main(String[] args) {
    long a=1232434234;
    long b=1937248378;

        System.out.println(a*b);
    }

    public static void seachCtr(){
   String a=    "给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。\n" +
               "\n" +
               "你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。\n" +
               "\n" +
               "示例:\n" +
               "\n" +
               "给定 nums = [2, 7, 11, 15], target = 9\n" +
               "\n" +
               "因为 nums[0] + nums[1] = 2 + 7 = 9\n" +
               "所以返回 [0, 1]";



    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
       return new  int[0];
    }


    @Test
    public void listContain(){
        ArrayList<String> arrayList = new ArrayList<>();
        // 存入100000个数据
        for (int i = 0; i < 100000; i++) {
            arrayList.add("test" + i);
        }
        // 验证300000个数据（其中20000不存在）
        long beginTime = System.currentTimeMillis();        for (int i = 0; i < 300000; i++) {
            arrayList.contains("test" + i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("cost time: " + (endTime - beginTime) + "ms");



    }

    @Test
    public void mapCOntain(){
        Map<String,Integer> hashSet = new HashMap<>();
        // 存入100000个数据
        for (int i = 0; i < 100000; i++) {
            hashSet.put("test" + i,i);
        }

        // 验证300000个数据（其中20000不存在）
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 300000; i++) {
            hashSet.containsKey("test" + i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("cost time: " + (endTime - beginTime) + "ms");
    }

}
