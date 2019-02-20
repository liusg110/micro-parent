package com.xy.client1.Thread;

/**
 * FileName: MyThread
 * Author: liusg
 * Date: 2019-02-20 18:39
 * Desc: 本地线程类
 */

public class MyThread extends Thread{
    //run方法为默认方法，线程操作在run()中实现
    private Integer i;

    public MyThread(Integer i){
        this.i=i;
    }

    public void run(){
        System.out.println("Thread"+i+"running");
    }
}
