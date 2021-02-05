package com.xy.client1.Builder2;

import com.xy.client1.doman.po.Car;

/**
 * 如果一个对象的构造很复杂，需要很多步骤，每个步骤本身以及步骤顺序都有可能不同，那么考虑建造者模式，
 * 把对象的构建和对象的组装分开 例如StringBuilder 的append方法
 *
 * 思想：对象的表示和对象的构建分离
 *
 * 工厂模式关注的是创建单个产品，而建造者模式则关注的是创建符合对象的多个部分
 *
 *
 *
 *
 */
public class TestBuilder {

    public static void main(String[] args) {
        //使用场景，当某个动作需要多步骤操作，为了减少使用方的调用难度，将多步骤进行封装，只暴露对应的构建类

        //工作流封装时，由于流程配置各部分相对独立，但是环节较多，我们定义了多种derector。分别定义各自的构建方式，detector中
        //传递的是构建类的接口



        CarDirector cd=new CarDirector();
        cd.constructCar(new TopMatchingBuilder());

        System.out.println("---------------------------");
        cd.constructCar(new SecondMatchingBuilder());
        System.out.println("---------------------------");
        cd.constructCar(new ComfortMatchingBuilder());

    }
}
