package com.thread1.t18;


/**
 * 测试：interrupt()停止线程——异常法：在线程中进行判断然后抛异常来停止线程
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1800);
            System.out.println("----------我将要停止thread----------");
            thread.interrupt();
            System.out.println("----------end---------");
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
