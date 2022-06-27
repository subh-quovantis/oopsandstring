package com.demo.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap();

        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(6,"Amit");
        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
        map.remove(5);


        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("Jai"));
        map.put(1,"subh");
        System.out.println(map);

    }
}
