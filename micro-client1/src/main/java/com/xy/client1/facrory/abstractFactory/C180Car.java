package com.xy.client1.facrory.abstractFactory;

/**
 * FileName: C180Car
 * Author: liusg
 * Date: 2019-01-02 17:16
 * Desc:
 */

public class C180Car implements Benz{

    /**
     * 构造方法，创建的时候就设置基本属性
     */
    public C180Car(){
        carColor();
        carSpeed();
        carPrice();
    }

    @Override
    public void carColor() {
        System.out.println("设置奔驰C180的颜色");
    }

    @Override
    public void carSpeed() {
        System.out.println("设置奔驰C180的速度");
    }

    @Override
    public void carPrice() {
        System.out.println("设置奔驰C180的价格");
    }
}
