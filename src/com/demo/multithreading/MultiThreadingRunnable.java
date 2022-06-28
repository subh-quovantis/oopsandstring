package com.demo.multithreading;



class MyThreadRunnable1 implements Runnable{
    public void run(){
        while (true){
            System.out.println("Thread 1 running");
        }

    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        while (true){
            System.out.println("Thread 2 running");
        }

    }
}
public class MultiThreadingRunnable {
    public static void main(String[] args) {
        MyThreadRunnable1 thread1= new MyThreadRunnable1();
        Thread t1 = new Thread(thread1);
        MyThreadRunnable2 thread2= new MyThreadRunnable2();
        Thread t2 = new Thread(thread2);
        t1.start();
        t2.start();
    }
}
