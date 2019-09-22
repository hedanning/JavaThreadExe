package com.thread1.t10;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("begin == "+myThread.isAlive());
        myThread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end == "+myThread.isAlive());
    }
}
