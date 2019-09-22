package com.thread1.t30;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        //将myThread设置为守护线程，即：主线程结束，myThread线程也就结束
        myThread.setDaemon(true);
        myThread.start();
        Thread.sleep(5000);
        System.out.println("--------------");
    }
}
