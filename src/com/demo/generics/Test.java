package com.demo.generics;

public class Test<T> {
    public T obj;

    public Test(T obj) {
        this.obj = obj;
    }
    public void check(){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Test<Integer> obj = new Test<>(5);
        Test<String> obj1 = new Test<>("Hello");
        obj.check();
        obj1.check();
    }
}
