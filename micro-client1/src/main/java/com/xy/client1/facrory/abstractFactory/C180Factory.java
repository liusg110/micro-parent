package com.xy.client1.facrory.abstractFactory;

/**
 * FileName: C180Factory
 * Author: liusg
 * Date: 2019-01-02 17:14
 * Desc:
 */

public class C180Factory implements BenzFactory{

    @Override
    public Benz createCar() {
        return  new C180Car();
    }

    @Override
    public Wheel crateWheel() {
        return new C180Wheel();
    }
}
