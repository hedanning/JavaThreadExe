package com.thread1.t22;

/**
 * 测试：出现数据不一致的问题
 */
public class Test {
    public static void main(String[] args) {
        SynchronizedObject object = new SynchronizedObject();
        MyThread myThread = new MyThread(object);
        myThread.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.stop();
        System.out.println(object.getUsername()+"  "+object.getPassword());
    }
}
