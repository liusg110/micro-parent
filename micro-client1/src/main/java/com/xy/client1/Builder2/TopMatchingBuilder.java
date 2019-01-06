package com.xy.client1.Builder2;

import com.xy.client1.doman.po.Car;

/**
 * 顶配车建造者
 */
public class TopMatchingBuilder implements CarBuilder{

    private Car car;

    public TopMatchingBuilder(){
        car= new Car();
    }

    @Override
    public void addMaps() {
        System.out.println("顶配车安装高德地图");
    }

    @Override
    public void addAcc() {
        System.out.println("顶配车安装ACC");
    }

    @Override
    public void addAirCondition() {
        System.out.println("顶配车安装自动空调");
    }

    @Override
    public void addHeat() {
        System.out.println("顶配车安装座椅方向盘加热");
    }

    @Override
    public Car BuilderCar() {
        return car;
    }
}
