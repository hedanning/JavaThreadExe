package com.thread2.t5;

/**
 * 测试：synchronized方法的访问————多个线程多个对象实例是异步的，多个线程一个实例对象是同步的
 */
public class Test {
    public static void main(String[] args) {
        MyObject object1 = new MyObject();
        ThreadA a = new ThreadA(object1);
        a.setName("A");


        MyObject object2 = new MyObject();
        //ThreadB b = new ThreadB(object1);
        ThreadB b = new ThreadB(object2);
        b.setName("B");

        a.start();
        b.start();
    }
}
