package com.xy.client1.strategy;

/**
 * FileName: Test
 * Author: liusg
 * Date: 2019-02-15 14:57
 * Desc:  此方法存在问题:缺乏工厂模式的优势，在客户端要进行判断，改进请见策略模式+简单工厂模式组合
 */

public class Test {
    public static void main(String[] args) {
        Context context;
        context=new Context(new ConcreteStrategyA());
        context.contextInterface();
    }

}
