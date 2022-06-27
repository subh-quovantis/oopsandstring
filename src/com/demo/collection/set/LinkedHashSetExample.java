package com.demo.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        System.out.println(set);
        set.remove("five");
        System.out.println(set);
        set.contains("one");

        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set);

    }


}
