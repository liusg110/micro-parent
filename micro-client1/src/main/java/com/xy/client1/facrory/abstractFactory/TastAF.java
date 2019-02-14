package com.xy.client1.facrory.abstractFactory;

/**
 * FileName: TastAF
 * Author: liusg
 * Date: 2019-01-02 17:42
 * Desc:
 *  fixme 工厂方法模式中也可以有多个具体的工厂，也是可以有多个抽象的产品和多个具体的工厂、具体的产品类。区别是在抽象工厂接口类中，能创建几个产品对象（本例中的汽车和轮胎）
 */

public class TastAF {
    public static void main(String[] args) {
        BenzFactory factory=new C180Factory();
        factory.createCar();
        factory.crateWheel();
    }

}
