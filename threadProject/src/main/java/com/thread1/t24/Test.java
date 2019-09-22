package com.thread1.t24;


/**
 * 测试：suspend暂停线程   resume恢复线程
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(5000);

        //A段代码：暂停线程
        System.out.println("A="+myThread.getI());
        myThread.suspend();     //暂停线程myThread
        System.out.println("A="+myThread.getI());
        Thread.sleep(5000);     //休眠主线程main，让myThread执行
        System.out.println("A="+myThread.getI());

        //B段代码：恢复线程
        System.out.println("B="+myThread.getI());
        myThread.resume();      //恢复myThread线程，继续执行
        System.out.println("B="+myThread.getI());
        Thread.sleep(5000);
        System.out.println("B="+myThread.getI());

    }
}
