package com.xy.client1.strategy;

/**
 * FileName: ConcteteStrategyA
 * Author: liusg
 * Date: 2019-02-15 14:52
 * Desc: 封装的具体的算法或者行为
 */

public class ConcreteStrategyC implements Strategy{

    @Override
    public void algorithmInterface() {
        System.out.println("实现算法C");
    }
}
