package com.thread2.t6;

public class ThreadB extends Thread {
    private MyObject object;
    public ThreadB(MyObject object){
        this.object = object;
    }
    @Override
    public void run() {
        super.run();
        object.methodB();
    }
}
