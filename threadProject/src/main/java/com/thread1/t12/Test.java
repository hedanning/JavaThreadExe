package com.thread1.t12;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //Thread t = new Thread(myThread);
        System.out.println("begin = "+System.currentTimeMillis());
        //t.run();
        //myThread.start();
        myThread.run();
        System.out.println("end = "+System.currentTimeMillis());
    }
}
