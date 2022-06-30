package com.demo.collection.map;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap();

        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(6,"Amit");
        map.put(11,"Bharat");
        map.put(113,"Bhumi");
        map.put(14,"Bhisma");
        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
        map.remove(5);


        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("Jai"));
        map.put(1,"subh");
        System.out.println(map);

        List<Map.Entry<Integer,String>> list= new ArrayList<>(map.entrySet());
        Collections.sort(list,(x1,x2)->x1.getKey().compareTo(x2.getKey()));
        list.forEach(x-> System.out.println("key = "+x.getKey() + " value = "+x.getValue()));
    }
}
