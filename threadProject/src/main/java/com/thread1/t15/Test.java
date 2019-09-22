package com.thread1.t15;


/**
 * 测试：interrupt()——this.interrupted():停止的是当前线程
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(3000);
            System.out.println("----------我要停止thread----------");
            thread.interrupt();
            Thread.currentThread().interrupt();
            System.out.println("----------end----------");
            System.out.println("Thread是否停止1？"+Thread.interrupted());
            System.out.println("Thread是否停止2？"+Thread.interrupted());
            System.out.println("thread是否停止1？"+thread.interrupted());
            System.out.println("thread是否停止2？"+thread.interrupted());
            System.out.println("---main线程停止，不输出---");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
