package com.thread1.t6;

public class Test {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("a");
        MyThread t2 = new MyThread("b");
        MyThread t3 = new MyThread("c");
        t1.start();
        t2.start();
        t3.start();
    }
}
