package com.thread1.t27;


public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        long begintime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0;i<10000000;i++){
            Thread.yield();
            count = count+(i+1);
        }
        long endtime = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+" 用时："+(endtime-begintime));
    }
}
