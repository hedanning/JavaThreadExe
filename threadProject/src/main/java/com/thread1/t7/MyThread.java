package com.thread1.t7;

public class MyThread extends Thread {
    private int count = 5;

    @Override
     synchronized public void run() {
        super.run();
        while(count>0){
            count--;
            System.out.println("由"+Thread.currentThread().getName()+"计算，count="+count);
        }
    }
}
