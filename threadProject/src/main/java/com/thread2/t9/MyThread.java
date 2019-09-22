package com.thread2.t9;

public class MyThread extends Thread {
    private Service service;
    public  MyThread(Service service){
        this.service = service;
    }
    @Override
    public void run() {
        super.run();
        service.service1();
    }
}
