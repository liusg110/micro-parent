package com.xy.client1.ProductAndConsumer.typeOne;

/**
 * 生产消费模式中的公共对象
 */
public class PublicObect {

    private int goods=0;

    public synchronized void product(){
        while (goods==5){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        goods++;
        System. out .println("生成货物成功！" );
        notify();
    }

    public synchronized void consumer(){
        while (goods==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        goods--;
        System.out.print("消费成功");
        notify();
    }


}
