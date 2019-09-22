package com.thread1.t27;

/**
 * 测试：yield方法——放弃当前的CPU资源
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        t1.setName("a");
        t1.start();

    }
}
