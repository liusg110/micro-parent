package com.xy.client1.facrory.factoryMethod;

import com.xy.client1.facrory.doman.ApplePhone;
import com.xy.client1.facrory.doman.Phone;

/**
 * FileName: AppleFactory
 * Author: liusg
 * Date: 2018-12-29 17:31
 * Desc: 具体的工厂类
 */

public class AppleFactory implements Factory{

    @Override
    public Phone productPhone() {
        return new ApplePhone();
    }
}
