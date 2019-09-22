package com.thread1.t20;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();

        try {
            System.out.println("线程的停止状态："+this.isInterrupted());
            for(int i = 0; i <5;i++){
                System.out.println("i="+(i+1));
            }
            System.out.println("----准备休眠线程---");
            Thread.sleep(20000);
            System.out.println("----准备休眠时间已结束---");
        } catch (InterruptedException e) {
            System.out.println("线程的停止状态："+this.isInterrupted());
            e.printStackTrace();
        }
        System.out.println("--------myTheard end----------");
    }
}
