package com.xy.client1.strategyAndSimopleFactory;

import com.xy.client1.strategy.Strategy;

/**
 * FileName: ConcreteStrategyB
 * Author: liusg
 * Date: 2019-02-15 14:54
 * Desc:
 */

public class ConcreteStrategyB implements Strategy{

    @Override
    public void algorithmInterface() {
        System.out.println("实现算法B");
    }
}
