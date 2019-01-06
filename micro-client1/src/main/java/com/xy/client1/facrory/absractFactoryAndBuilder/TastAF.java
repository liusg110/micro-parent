package com.xy.client1.facrory.absractFactoryAndBuilder;

/**
 * FileName: TastAF
 * Author: liusg
 * Date: 2019-01-02 17:42
 * Desc:
 */

public class TastAF {
    public static void main(String[] args) {
        BenzFactory factory=new C180Factory();
        factory.createCar();
        factory.crateWheel();
    }

}
