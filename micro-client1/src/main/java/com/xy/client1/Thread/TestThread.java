package com.xy.client1.Thread;

/**
 * FileName: TestThread
 * Author: liusg
 * Date: 2019-02-20 18:43
 * Desc:
 */

public class TestThread {
    public static void main(String[] args) {
        MyThread thread1=new MyThread(1);
        MyThread thread2=new MyThread(2);
        //通过Thread类的Start()启动，该方法是native方法
        //将启动一个线程并自动执行run()方法
        thread1.start();
        thread2.start();
    }

}
