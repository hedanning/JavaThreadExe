package com.thread1.t19;


/**
 * 测试：停止线程——在沉睡中停止线程（先休眠再停止）
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(2000);
        myThread.interrupt();
    }
}
