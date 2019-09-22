package com.thread1.t4;

/**
 * 测试：执行start()方法的顺序不代表线程启动的顺序
 */
public class Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(1);
        MyThread t2 = new MyThread(2);
        MyThread t3 = new MyThread(3);
        MyThread t4 = new MyThread(4);
        MyThread t5 = new MyThread(5);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
