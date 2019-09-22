package com.thread1.t2;

/**
 * 测试：使用多线程技术时，代码的运行结果与代码执行顺序或调用的顺苏时无关的
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}

