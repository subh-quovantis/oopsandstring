package com.demo.strings;

import java.util.Locale;

public class StringExamples {
    public static void main(String[] args) {


        String name="My Name is Subham";
        char ch=name.charAt(3); // returns character at 3rd position n
        System.out.println(ch);

        String s1="dog";
        String s2="rat";
        String s3="bat";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));

        String str = "Country";
        String s = "India is my ".concat(str);
        System.out.println(s);


        String animal="dog";
        String animal1="dog";
        String animal2="DOG";
        String animal3="rat";
        System.out.println(animal.equals(animal1));
        System.out.println(animal.equals(animal3));
        System.out.println(animal.equalsIgnoreCase(animal2));

        String sentence="this is index of example";
        System.out.println(sentence.indexOf("is"));

        String empty="";
        String notEmpty="abc";

        System.out.println(empty.isEmpty());
        System.out.println(notEmpty.isEmpty());

        String sentences="java string split method by using split function";
        String[] words=sentences.split("\\s");
        for(String w:words){
            System.out.println(w);
        }


        System.out.println(sentences.toLowerCase());
        System.out.println(sentences.toUpperCase());

    }
}
