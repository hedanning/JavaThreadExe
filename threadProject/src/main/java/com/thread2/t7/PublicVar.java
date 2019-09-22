package com.thread2.t7;

public class PublicVar {
    public String username="A";
    public String password="AA";
    synchronized  public void setValue(String username,String password){
        try {
            this.username = username;
            Thread.sleep(2000);
            this.password = password;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("getValue thread name="+Thread.currentThread().getName()+" username="+username+" password="+password);
    }

    public void getValue(){
        System.out.println("getValue thread name="+Thread.currentThread().getName()+" username="+username+" password="+password);
    }
}
