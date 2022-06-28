package com.demo.multithreading;

public class SynchronizedMultiThreading {
    synchronized void printTable(int n) {//synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

class TestSynchronization3 {
    public static void main(String args[]) {
        SynchronizedMultiThreading obj = new SynchronizedMultiThreading();//only one object

        Thread t1 = new Thread() {
            public void run() {
                obj.printTable(5);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                obj.printTable(100);
            }
        };
        t1.start();
        t2.start();
    }
}


