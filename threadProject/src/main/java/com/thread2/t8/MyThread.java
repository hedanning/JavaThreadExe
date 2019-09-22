package com.thread2.t8;

public class MyThread extends Thread {
    private PublicVar publicVar;
    public MyThread(PublicVar publicVar){
        this.publicVar = publicVar;
    }
    @Override
    public void run() {
        super.run();
        publicVar.setValue("B","BB");
    }
}
