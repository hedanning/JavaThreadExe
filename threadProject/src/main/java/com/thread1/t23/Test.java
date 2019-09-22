package com.thread1.t23;

/**
 * 测试：interrupt(）与 return 结合使用停止线程
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(2000);
        myThread.interrupt();
    }
}
