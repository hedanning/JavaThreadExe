package com.thread1.t16;


/**
 * 测试：interrupt()——this.isInterrupted():停止的是线程对象
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(3000);
            System.out.println("----------我要停止thread----------");
            thread.interrupt();
            System.out.println("----------end----------");
            System.out.println("是否停止1？"+thread.isInterrupted());
            System.out.println("是否停止2？"+thread.interrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
