package com.thread1.t23;

public class MyThread extends Thread {
    private int i =0 ;
    @Override
    public void run() {
        super.run();
        while(true){
            /*i++;
            System.out.println("i="+i);*/
            if(this.isInterrupted()){
                System.out.println("MyThread线程停止了！！！");
                return;
            }
            System.out.println("time="+System.currentTimeMillis());
        }
    }
}
