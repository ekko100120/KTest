package com.KTest.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testCir {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        Map<String,String> map = new HashMap<>();

        map.put("c","CCC");
        map.put("d","DDD");
        map.put("a","AAA");
        map.put("b","BBB");


        for (int i=0;i<list.size();i++){

            for(String str: map.keySet()){
                if (str.equals(list.get(i))){
                    System.out.println(map.get(str));
                }
            }
        }

    }
}
