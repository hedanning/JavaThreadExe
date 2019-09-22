package com.thread1.t15;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i = 0; i<400000;i++){
            System.out.println("i="+(i+1));
        }
    }
}
