package com.thread1.t3;

/**
 * 测试：线程调用的随机性
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setName("myThread");
            //thread.start();   //异步执行
            thread.run();       //同步执行
            for (int i = 0;i < 10;i++){
                int time = (int) (Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName());
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
