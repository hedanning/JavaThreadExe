package com.thread2.t2;


/**
 * 测试：实例变量是非线程安全的
 */
public class Test {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        MyThreadA t1 = new MyThreadA(numRef);
        t1.start();
        System.out.println("--------------------------");
        MyThreadB t2 = new MyThreadB(numRef);
        t2.start();
    }
}
