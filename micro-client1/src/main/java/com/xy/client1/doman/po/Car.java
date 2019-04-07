package com.xy.client1.doman.po;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
public class Car extends GosnUtil{

    private String maps;

    private String acc;

    private String airContidion;

    private String heat;

    public String getMaps() {
        return maps;
    }

    public void setMaps(String maps) {
        this.maps = maps;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getAirContidion() {
        return airContidion;
    }

    public void setAirContidion(String airContidion) {
        this.airContidion = airContidion;
    }

    public String getHeat() {
        return heat;
    }

    public void setHeat(String heat) {
        this.heat = heat;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maps='" + maps + '\'' +
                ", acc='" + acc + '\'' +
                ", airContidion='" + airContidion + '\'' +
                ", heat='" + heat + '\'' +
                '}';
    }



    public static void main(String[] args) {
        Car car=new Car();
        car.setMaps("111");
        car.setAcc("222");
        System.out.println(car.toJson());
        Car car1 = car.form(Car.class);
        System.out.println(car1.getMaps());
    }
}
