package com.thread1.t9;

/**
 *测试：currentThread()方法2
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //myThread.setName("A");
        //myThread.start();
        //myThread.run();

        Thread t1 = new Thread(myThread,"A");
        t1.run();
    }
}
