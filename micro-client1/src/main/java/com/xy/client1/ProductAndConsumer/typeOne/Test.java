package com.xy.client1.ProductAndConsumer.typeOne;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
public class Test {
    public static void main(String[] args) {
        PublicObect o=new PublicObect();
        Producer p=new Producer(o);
        Consumer c=new Consumer(o);

        Thread t1=new Thread(p);
        Thread t2=new Thread(c);

        t1.start();
        t2.start();


    }
}
