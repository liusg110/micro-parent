package com.xy.client1.Builder2;

import com.xy.client1.doman.po.Car;

/**
 * 舒适型建造者
 */
public class ComfortMatchingBuilder implements  CarBuilder{

    private Car car;

    public ComfortMatchingBuilder() {
        this.car = new Car();
    }

    @Override
    public void addMaps() {
        car.setMaps("舒适型安装百度地图");
        System.out.println("舒适型安装百度地图");
    }

    @Override
    public void addAcc() {
        //fixme 舒适型不安装ACC
        System.out.println("舒适型不安装Acc");
    }

    @Override
    public void addAirCondition() {
        System.out.println("舒适型安装手动空调");
    }

    @Override
    public void addHeat() {
        System.out.println("舒适型不安装加热系统");
    }

    @Override
    public Car BuilderCar() {
        return car;
    }
}

