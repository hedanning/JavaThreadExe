package com.thread1.t26;


/**
 * 测试：suspend和resume的缺点——数据不同步
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyObject object = new MyObject();
        MyThread myThread = new MyThread(object);
        myThread.setName("a");
        //myThread.run();    //此时，直接是由main线程来运行的
        myThread.start();
        Thread.sleep(2000);
        object.printUsernamePassword();
    }
}
