package com.xy.client1.Builder2;

import com.xy.client1.doman.po.Car;

/**
 * 次顶配车建造者
 */

public class SecondMatchingBuilder implements CarBuilder{

   private Car car;

    public SecondMatchingBuilder() {
        car=new Car();
    }

    @Override
    public void addMaps() {
        System.out.println("次顶配车安装高德地图");
    }

    @Override
    public void addAcc() {
        System.out.println("次顶配车安装耳机ACC");
    }

    @Override
    public void addAirCondition() {
        System.out.println("次顶配安装自动空调");
    }

    @Override
    public void addHeat() {

    }

    @Override
    public Car BuilderCar() {
        return car;
    }
}
