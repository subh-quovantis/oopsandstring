package com.demo.collection.set;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;

public class HashSet {




    public void example(){
        Integer[] a= {1,5,2,6,8,9};
        Integer[] b={1,2,3,4,11,5};
        Set<Integer> set1 = new java.util.HashSet<>();
        Set<Integer> set2 = new java.util.HashSet<>();
        set1.addAll(Arrays.asList(a));
        set2.addAll(Arrays.asList(b));

        System.out.println(set1);

        set1.remove(1);
        System.out.println(set1);

        System.out.println(set1.contains(5));
        System.out.println(set1.size());
        System.out.println(set1.isEmpty());

    }

    public static void main(String[] args) {
        HashSet set= new HashSet();
        set.example();
    }
}
