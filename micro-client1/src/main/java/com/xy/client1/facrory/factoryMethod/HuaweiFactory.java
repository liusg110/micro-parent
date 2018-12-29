package com.xy.client1.facrory.factoryMethod;

import com.xy.client1.facrory.doman.HuaweiPhone;
import com.xy.client1.facrory.doman.Phone;

/**
 * FileName: HuaweiFactory
 * Author: liusg
 * Date: 2018-12-29 17:32
 * Desc: 具体工厂类，华为
 */

public class HuaweiFactory implements Factory{

    @Override
    public Phone productPhone() {
        return new HuaweiPhone();
    }
}
