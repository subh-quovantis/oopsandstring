package com.demo.exceptionhandling;

public class TestException extends ParentException{
    @Override
    void msg()throws ArithmeticException  {
        System.out.println("child method");
    }

    public static void main(String args[]) {
        ParentException p = new TestException();

        try {
            p.msg();
        }
        catch (Exception e){}

    }
}
