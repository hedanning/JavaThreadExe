package com.thread1.t18;

public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        try{

            for(int i = 0; i<500000;i++){
                if(this.interrupted()){
                    System.out.println("此线程已停止");
                    throw  new InterruptedException();
                }
                System.out.println("i="+(i+1));
            }
        }catch (InterruptedException e){
            System.out.println("进MyThread.java类run方法中的catch了！");
            e.printStackTrace();
        }
    }
}
