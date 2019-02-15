package com.xy.client1.strategyAndSimopleFactory;

import com.xy.client1.strategy.Strategy;

/**
 * FileName: Context
 * Author: liusg
 * Date: 2019-02-15 14:55
 * Desc: Context用一个concreteStrategy来配置，维护一个队Startegy对象的引用
 */

public class Context {
    private Strategy strategy;


    public Context(String type) {

        switch (type) {
            case "A":
                strategy = new ConcreteStrategyA();
                break;
            case "B":
                strategy = new ConcreteStrategyB();
                break;
            case "C":
                strategy = new ConcreteStrategyC();
                break;
        }
    }

    public void summery() {
        strategy.algorithmInterface();
    }
}
