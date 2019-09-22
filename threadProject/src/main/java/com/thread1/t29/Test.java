package com.thread1.t29;

/**
 *  测试：线程的优先级——规则性、随机性
 */
public class Test {
    public static void main(String[] args) {
        for (int i= 0; i<5;i++){
            MyThread1 myThread1 = new MyThread1();
            myThread1.setPriority(5);
            myThread1.start();

            MyThread2 myThread2 = new MyThread2();
            myThread2.setPriority(6);
            myThread2.start();

        }
    }
}
