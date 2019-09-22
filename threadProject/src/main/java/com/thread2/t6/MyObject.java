package com.thread2.t6;

public class MyObject {
   synchronized public void methodA()  {
        System.out.println("begin methodA threadName="+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }

    public void methodB()  {
        System.out.println("begin methodB threadName="+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
