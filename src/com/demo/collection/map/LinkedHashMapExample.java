package com.demo.collection.map;

import java.security.KeyStore;
import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        map.put(103,"subham");
        map.put(104,"avishek");
        System.out.println("keys"+map.keySet());
        System.out.println("values"+map.values());
        System.out.println("Key-Value pairs: "+map.entrySet());

        List<Map.Entry<Integer,String>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,(o1,o2)->o1.getValue().toLowerCase().compareTo(o2.getValue().toLowerCase()));
        list.forEach(x-> System.out.println("sorted key = "+x.getKey() +" sorted value = "+x.getValue()));


    }
}
