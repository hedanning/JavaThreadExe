package com.thread2.t2;

public class HasSelfPrivateNum {
    int num = 0 ;
    public void addI(String username){
        if(username.equals("a")){
            num = 100;
            System.out.println("----a set over！");
            //aThread 休眠，bThread开始执行
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            num = 200;
            System.out.println("----b set over！");
        }
        System.out.println(username + " num="+num);
    }
}
