package com.xy.client1.Builder2;

import com.xy.client1.doman.po.Car;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: 汽车组装工艺流程
 * @date ${date} ${time}
 * ${tags}
 */
public interface CarBuilder {
    void addMaps();  //安装导航

    void addAcc();  //安装自适应巡航

    void addAirCondition();//安装空调

    void addHeat();  //安装加热系统

    Car BuilderCar();

}
