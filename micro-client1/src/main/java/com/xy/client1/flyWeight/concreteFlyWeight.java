package com.xy.client1.flyWeight;

/**
 * FileName: concreteFlyWeight
 * Author: liusg
 * Date: 2019-02-15 14:25
 * Desc: 具体的享元类，实现享元接口。该类的对象将被复用
 */

public class concreteFlyWeight implements FlyWeight{

    private String name;
    public concreteFlyWeight(String name){
        this.name=name;
    }

    @Override
    public void action(String externalState) {
        System.out.println("name=="+name+"outerState=="+externalState);
    }
}
