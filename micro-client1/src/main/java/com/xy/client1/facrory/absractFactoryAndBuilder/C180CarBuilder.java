package com.xy.client1.facrory.absractFactoryAndBuilder;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
public class C180CarBuilder implements BenzBuilder{

    private C180Car c180Car;
    private C180Wheel c180Wheel;

    public C180CarBuilder() {
        this.c180Car = new C180Car();
    }

    @Override
    public void addCarBody() {
        c180Car.carColor();
        c180Car.carPrice();
        c180Car.carSpeed();
    }

    @Override
    public void addWheel() {
        c180Wheel.wheelPrice();
        c180Wheel.wheelSize();
    }

    @Override
    public Benz buildBenz() {
        return null;
    }
}
