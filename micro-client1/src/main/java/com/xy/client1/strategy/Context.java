package com.xy.client1.strategy;

/**
 * FileName: Context
 * Author: liusg
 * Date: 2019-02-15 14:55
 * Desc: Context用一个concreteStrategy来配置，维护一个队Startegy对象的引用
 */

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
