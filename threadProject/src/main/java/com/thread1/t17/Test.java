package com.thread1.t17;


/**
 * 测试：interrupt()停止线程，判断之后使用break退出，还是会执行以下的代码
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1800);
            System.out.println("----------我要停止thread----------");
            thread.interrupt();
            System.out.println("----------end----------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
