package com.demo.AnonymousClass;

public class AnonymousExample {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("Anonymous");
            }
        };
        obj.show();
    }
}
