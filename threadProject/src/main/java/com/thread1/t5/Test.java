package com.thread1.t5;


/**
 * 测试：Runnable接口
 */
public class Test {
    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
