package com.thread1.t28;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        super.run();
        //因为直接是线程对象调用，所以this和Thread.currentThread()是一样的
        System.out.println("thread1 的优先级："+Thread.currentThread().getPriority());
       // System.out.println("thread1 的优先级："+this.getPriority());
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }
}
