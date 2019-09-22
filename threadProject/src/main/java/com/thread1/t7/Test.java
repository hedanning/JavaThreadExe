package com.thread1.t7;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread,"a");
        Thread t2 = new Thread(myThread,"b");
        Thread t3 = new Thread(myThread,"c");
        Thread t4 = new Thread(myThread,"d");
        Thread t5 = new Thread(myThread,"e");
        Thread t6 = new Thread(myThread,"f");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
