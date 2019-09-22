package com.thread1.t12;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run threadName="+Thread.currentThread().getName()+" begin = "+System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println("run threadName="+Thread.currentThread().getName()+" end = "+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
