package com.demo.exceptionhandling;

import java.io.IOException;

public class Numbers {

    public void writeList() {
        int[] arr = new int[10];
        try {
            arr[10] = 11;

        }

        catch (NumberFormatException e1) {
            System.out.println("NumberFormatException => " + e1.getMessage());
        }

        catch (IndexOutOfBoundsException e2) {
            System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
        }


        try{
            int a =10/0;
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception => "+e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
    }

    void n()throws IOException {

    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled");}
    }
    public  void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.writeList();
        num.checkAge(10);
        num.p();
    }

}
