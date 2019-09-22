package com.thread1.t8;


/**
 * 测试：currentThread()方法1
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //myThread.start();
        myThread.run();
    }
}
