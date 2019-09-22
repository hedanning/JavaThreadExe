package com.thread2.t4;


/**
 * 测试：多个对象多个锁
 */
public class Test {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        MyThreadA t1 = new MyThreadA(numRef1);
        t1.start();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        MyThreadB t2 = new MyThreadB(numRef2);
        t2.start();
    }
}
