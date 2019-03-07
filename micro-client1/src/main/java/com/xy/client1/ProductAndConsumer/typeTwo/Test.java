package com.xy.client1.ProductAndConsumer.typeTwo;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
public class Test {
    public static void main(String[] args) {
        //生产线线程
        new Thread(new ProducerConsumerProblem.Producer()).start();
        //消费者线程
        new Thread(new ProducerConsumerProblem.Consumer()).start();
    }
}
