package com.xy.client1.facrory.simpleFactory;

import com.xy.client1.facrory.doman.Phone;

/**
 * FileName: TestSimpleFactory
 * Author: liusg
 * Date: 2018-12-29 17:16
 * Desc: 简单工厂模式测试类
 */

public class TestSimpleFactory {
    public static void main(String[] args) {
        Phone phone = Phonefactory.product("apple");
        phone.callNumber("110");

    }
}
