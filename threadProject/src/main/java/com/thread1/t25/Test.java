package com.thread1.t25;

/**
 * 测试：suspend和resume的缺点——独占公共的同步资源
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        SynchronizedObject object = new SynchronizedObject();
        Thread a = new Thread(){
            @Override
            public void run() {
                super.run();
                object.printString();
            }
        };
        a.setName("A");
        a.start();
        Thread.sleep(1000);

        Thread b = new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println("b线程启动了，但进不了printString方法");
                System.out.println("因为printString方法被a线程锁定并且永远暂停了！");
                object.printString();
            }
        };
        b.setName("B");
        b.start();
    }
}
