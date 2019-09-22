package com.thread2.t2;

public class MyThreadB extends Thread {
    private HasSelfPrivateNum numRef;
    public MyThreadB(HasSelfPrivateNum numRef){
        this.numRef = numRef;
    }
    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
