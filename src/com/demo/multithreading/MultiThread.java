package com.demo.multithreading;


class MultiThreadDemo1 extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("Thread 1 running");
        }

    }
}

class MultiThreadDemo2 extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("Thread 2 running");
        }

    }
}


public class MultiThread {
    public static void main(String[] args) {
        MultiThreadDemo1 thread = new MultiThreadDemo1();
        MultiThreadDemo2 thread2 = new MultiThreadDemo2();
        thread.start();
        thread2.start();
    }
}
