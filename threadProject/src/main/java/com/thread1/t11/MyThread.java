package com.thread1.t11;


public class MyThread extends Thread {
    public MyThread(){
        System.out.println("MyThread----begin");

        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.currentThread().getName()="+this.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()="+Thread.currentThread().isAlive());
        System.out.println("this.getName()="+this.getName());
        System.out.println("this.isAlive()="+this.isAlive());
        System.out.println("MyThread----end");
    }

    @Override
    public void run() {
        System.out.println("run----begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.currentThread().getName()="+this.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()="+Thread.currentThread().isAlive());
        System.out.println("this.getName()="+this.getName());
        System.out.println("this.isAlive()="+this.isAlive());
        System.out.println("run----end");
    }
}
