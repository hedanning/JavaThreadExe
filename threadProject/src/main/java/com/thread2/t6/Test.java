package com.thread2.t6;

/**
 * 测试：synchronized方法与是锁对象
 */
public class Test {
    public static void main(String[] args) {
        MyObject object1 = new MyObject();
        ThreadA a = new ThreadA(object1);
        a.setName("A");


        MyObject object2 = new MyObject();
        ThreadB b = new ThreadB(object1);
        //ThreadB b = new ThreadB(object2);
        b.setName("B");

        a.start();
        b.start();
    }
}
