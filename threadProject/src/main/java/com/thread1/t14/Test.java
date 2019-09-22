package com.thread1.t14;


/**
 * 测试：interrupt()
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            System.out.println("========");
            Thread.sleep(3000);
            System.out.println("----------我要停止thread----------");
            thread.interrupt();
            System.out.println("----------end----------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
