package com.thread1.t26;

public class MyThread extends Thread {
    private MyObject object;
    public MyThread(MyObject o){
        this.object = o;
    }

    @Override
    public void run() {
        super.run();
        object.setValue("a","aa");
    }
}
