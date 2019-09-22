package com.thread1.t29;

import java.util.Random;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        long begintime = System.currentTimeMillis();
        long result = 0;
        super.run();
        //for (int j = 0 ;j<5;j++){
            for (int i = 0;i < 500000;i++){
                Random random = new Random();
                random.nextInt();
                result = result+i;
            }
            long endtime = System.currentTimeMillis();
            System.out.println("########thread 2 use time="+(endtime-begintime));
       // }
        /*for (int i = 0;i < 500000;i++){
            result = result+i;
        }
        long endtime = System.currentTimeMillis();
        System.out.println("########thread 2 use time="+(endtime-begintime));*/
    }
}
