package com.thread1.t25;

public class SynchronizedObject {
    synchronized public void printString(){
        System.out.println("进入到同步方法的线程："+Thread.currentThread().getName());
        if(Thread.currentThread().getName().equals("A")){
            System.out.println("a线程永远suspend，导致其他线程不能访问公共资源");
            Thread.currentThread().suspend();
        }
        System.out.println("end!!!");
    }
}
