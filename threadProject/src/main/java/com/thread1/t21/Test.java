package com.thread1.t21;

/**
 * 测试：停止线程——暴力停止stop()
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.stop();
    }
}
