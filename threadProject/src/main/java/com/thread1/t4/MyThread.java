package com.thread1.t4;

public class MyThread extends Thread {
    private int i;
    public MyThread(int i){
        super();
        this.i = i;
    }

    @Override
    public void run() {
        super.run();
        System.out.println(i);
    }
}
