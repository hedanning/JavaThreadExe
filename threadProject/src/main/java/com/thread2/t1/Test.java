package com.thread2.t1;
/**
 * 测试：方法内的变量是线程安全的
 */
public class Test {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        MyThreadA  aThread = new MyThreadA(numRef);
        aThread.start();

        MyThreadB bThread = new MyThreadB(numRef);
        bThread.start();
    }
}
