package com.thread2.t2;

public class MyThreadA extends Thread {
    private HasSelfPrivateNum numRef;
    public MyThreadA(HasSelfPrivateNum numRef){
        this.numRef = numRef;
    }
    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}
