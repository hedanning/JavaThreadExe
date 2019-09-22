package com.thread1.t22;

public class MyThread extends Thread {
    private SynchronizedObject object;
    public MyThread(SynchronizedObject object){
        this.object = object;
    }
    @Override
    public void run() {
        super.run();
        object.printString("b","bb");
    }
}
