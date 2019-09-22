package com.thread2.t9;

/**
 * 测试：synchronized锁重入
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service();
        MyThread myThread = new MyThread(service);
        myThread.start();
    }
}
