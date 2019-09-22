package com.thread1.t28;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("thread1 的优先级："+Thread.currentThread().getPriority());
        //System.out.println("thread1 的优先级："+this.getPriority());
    }
}
