package com.xy.client1.strategyAndSimopleFactory;

import com.xy.client1.strategy.Strategy;

/**
 * FileName: ConcteteStrategyA
 * Author: liusg
 * Date: 2019-02-15 14:52
 * Desc: 封装的具体的算法或者行为
 */

public class ConcreteStrategyA  implements Strategy{

    @Override
    public void algorithmInterface() {
        System.out.println("实现算法A");
    }
}
