package com.thread1.t29;

import java.util.Random;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        long begintime = System.currentTimeMillis();
        long result = 0;
        super.run();
        /*for (int i = 0;i < 50000;i++){
            result = result+i;
        }
        long endtime = System.currentTimeMillis();
        System.out.println("********thread 1 use time="+(endtime-begintime));*/
        //for (int j = 0 ;j<5;j++){
            for (int i = 0;i < 50000;i++){
                Random random = new Random();
                random.nextInt();
                result = result+i;
            }
            long endtime = System.currentTimeMillis();
            System.out.println("********thread 1 use time="+(endtime-begintime));
        //}
    }
}
