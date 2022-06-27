package com.demo.collection.list;

import java.util.Vector;

public class CollectionVector {
    void example(){
        Vector<String> color_range = new Vector<>();


        color_range.add("Blue");
        color_range.add("Black");
        color_range.add("Gray");
        color_range.add("Pink");
        color_range.add("Orange");

        System.out.println(color_range);

        color_range.set(2,"white");
        System.out.println(color_range);

        
    }

    public static void main(String[] args) {
        CollectionVector list = new CollectionVector();
        list.example();
    }
}
