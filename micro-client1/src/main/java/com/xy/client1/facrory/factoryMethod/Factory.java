package com.xy.client1.facrory.factoryMethod;


/*工厂模式涉及到四个概念
    1.抽象的工厂接口，工厂方法的核心，创建产品的类必须实现该接口
    2.具体的工厂类，该角色实现抽象工厂接口，具体如何创建就是在该类中实现
    3.抽象产品接口，所有产品的类，负责实现产品公共属性的抽象定义
    4.具体的产品类，实现抽象的产品接口，负责具体不同产品的业务逻辑*/

import com.xy.client1.facrory.doman.Phone;

/**
 * FileName: Factory
 * Author: liusg
 * Date: 2018\12\29 0029
 * Desc: 抽象的工厂接口
 *
 */
public interface Factory {
    Phone productPhone();
}
