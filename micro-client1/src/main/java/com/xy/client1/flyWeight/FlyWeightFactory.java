package com.xy.client1.flyWeight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * FileName: FlyWeightFactory
 * Author: liusg
 * Date: 2019-02-15 14:29
 * Desc: 享元工厂
 *
 *  享元模式中，最关键的享元工厂。它将维护已创建的享元实例，并通过实例标记（一般用内部状态）去索引对应的实例。
 *  当目标对象未创建时，享元工厂负责创建实例并将其加入标记-对象映射。当目标对象已创建时，享元工厂直接返回已有实例，实现对象的复用
 */

public class FlyWeightFactory {
    private static ConcurrentHashMap<String,FlyWeight> allFlyWeight=new ConcurrentHashMap<>();

    public static FlyWeight getFlyWeight(String name){
        if(allFlyWeight.get(name)==null){
            synchronized (allFlyWeight){
                if(allFlyWeight.get(name)==null){
                    System.out.println("instance of "+name+"dose not exist,creating it");
                    FlyWeight flyWeight=new concreteFlyWeight(name);
                    allFlyWeight.put(name,flyWeight);
                }
            }
        }
        return allFlyWeight.get(name);
    }
}
