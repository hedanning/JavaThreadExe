package com.thread2.t3;


/**
 * 测试：解决实例变量是非线程安全的问题，加关键字synchronized
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
