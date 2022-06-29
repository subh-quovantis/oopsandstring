package com.demo.streams;

import com.demo.AnonymousClass.A;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList();
        ArrayList<String> names = new ArrayList();
        marks.add(5);
        marks.add(8);
        marks.add(6);
        marks.add(9);
        marks.add(15);
        marks.add(18);
        marks.add(20);
        List<Integer> updatedMarks= marks.stream().filter(x->x>10).collect(Collectors.toList());
        List<Integer> updatedMarks2= marks.stream().map(x->x+2).collect(Collectors.toList());
        System.out.println(updatedMarks);
        System.out.println(updatedMarks2);
        names.add("subham");
        names.add("Avishek");
        names.add("akash");
        names.add("bhadani");
        names.add("Surya");
        List<String> names1 = names.stream().filter(x->x.contains("s")).map(x->x.replace("s","k")).collect(Collectors.toList());
        System.out.println(names1);
        List<Integer> sortedMarks = marks.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedMarks);
        List<String> sortedNames =names.stream().map(x->x.toLowerCase()).sorted().collect(Collectors.toList());
        System.out.println(sortedNames);
        List<Integer> descNumbers = marks.stream().sorted((x1,x2)->(x1<x2)?1:(x1>x2)?-1:0).collect(Collectors.toList());
        System.out.println(descNumbers);
        List<Integer> descNumbers2 = marks.stream().sorted((x1,x2)->x2.compareTo(x1)).collect(Collectors.toList());
        System.out.println(descNumbers2);
        Integer maxNum = marks.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(maxNum);
        Integer minNum = marks.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(minNum);
        marks.stream().forEach(System.out::println);
    }
}
