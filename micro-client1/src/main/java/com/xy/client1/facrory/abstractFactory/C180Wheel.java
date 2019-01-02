package com.xy.client1.facrory.abstractFactory;

/**
 * FileName: C180Wheel
 * Author: liusg
 * Date: 2019-01-02 17:30
 * Desc:
 */

public class C180Wheel implements Wheel {


    public C180Wheel() {
        wheelPrice();
        wheelSize();
    }

    @Override
    public void wheelSize() {
        System.out.println("设置C180的轮胎尺寸");
    }

    @Override
    public void wheelPrice() {
        System.out.println("设置C180的轮胎价格");
    }
}
