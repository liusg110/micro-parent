package com.xy.client1.strategyAndSimopleFactory;

import com.xy.client1.adapter.integerfaceAdapter.A;
import com.xy.client1.strategy.Strategy;

/**
 * FileName: Context
 * Author: liusg
 * Date: 2019-02-15 14:55
 * Desc: Context用一个concreteStrategy来配置，维护一个队Startegy对象的引用
 */

public class Context {
    private Strategy strategy;


    public Context(String type) {  //fixme  比如根据不同的价格处理不同的策略

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


    public static String testEmun(StrategyEnum em) {//fixme 根据不同的枚举执行不同的方法，
        switch (em) {                               //背调中根据传的不同的值执行不同的方法
            case A:
                return em.getMsg();
            case B:
                return em.getMsg();
            case C:
                return em.getMsg();
            default:
                throw new RuntimeException("枚举超出范围");
        }
    }
}
