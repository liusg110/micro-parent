package com.xy.client1.Builder2;

import com.xy.client1.doman.po.Car;

/**
 * 汽车制造
 */
public class CarDirector {

    public Car constructCar(CarBuilder builder){
        builder.addMaps();
        builder.addAcc();
        builder.addAirCondition();
        builder.addHeat();
        return builder.BuilderCar();
    }
}
