package com.thread2.t7;

/**
 * 测试：演示脏读问题
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        PublicVar publicVar = new PublicVar();
        MyThread myThread = new MyThread(publicVar);
        myThread.setName("A");
        myThread.start();
        Thread.sleep(200);
        publicVar.getValue();
    }
}
