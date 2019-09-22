package com.thread1.t28;

/**
 * 测试：线程的优先级——继承性
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("main begin 的优先级："+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main end 的优先级："+Thread.currentThread().getPriority());
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
    }
}
