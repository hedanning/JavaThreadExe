package com.thread1.t17;

public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        for(int i = 0; i<400000;i++){
            if(this.interrupted()){
                System.out.println("此线程已停止");
                break;
            }
            System.out.println("i="+(i+1));
        }
    }
}
