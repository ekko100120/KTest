package com.KTest.test;

import java.util.*;
public class test {

    public static void main(String[] args) {

        Random random = new Random();
        random.nextBoolean()
        Map<String,String> map = new HashMap<>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");
        Set<Map.Entry<String, String>> list = map.entrySet();

        String a="   abc  cfg  ";
        String b = a.trim();
        System.out.println(a);
    }
}
