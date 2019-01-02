package com.xy.client1.facrory.abstractFactory;
/**
 * FileName: BenzFactory
 * Author: liusg
 * Date: 2019\1\2 0002
 * Desc: 奔驰工厂抽象接口
 *
 */

    /*
    当一个对象都有相同的约束时，可以使用抽象工厂模式。
    打个比方说，这个工厂的几个产品都需要经过某些共同的步骤和打上相同的商标，
    这一组产品可以在一个工厂里面生产，减少很多重复的代码在不同的地方都出现多次。
    */

    /*
        todo 工厂方法模式引入工厂等级结构，解决了简单工厂模式中工厂类职责过重的问题，
        todo 但由于工厂方法模式中每个工厂只创建一类具体类的对象，这将会导致系统当中的工厂类过多，这势必会增加系统的开销。
        todo 此时，我们可以考虑将一些相关的具体类组成一个“具体类族”，由同一个工厂来统一生产，这就是我们本文要说的“抽象工厂模式”的基本思想。
     */
public interface BenzFactory {
    /*
        建造汽车
     */
    Benz createCar();

    /*
        建造轮子
     */
    Wheel crateWheel();

}
