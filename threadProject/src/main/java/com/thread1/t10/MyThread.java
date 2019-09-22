package com.thread1.t10;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("run="+this.isAlive());
    }
}
