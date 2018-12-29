package com.xy.client1.facrory.simpleFactory;

import com.xy.client1.facrory.doman.ApplePhone;
import com.xy.client1.facrory.doman.HuaweiPhone;
import com.xy.client1.facrory.doman.Phone;

/**
 * FileName: Phonefactory
 * Author: liusg
 * Date: 2018-12-29 16:49
 * Desc: 简单工厂模式（静态工厂模式）类
 */

public class Phonefactory {

    //todo  thinking   the efficiency of if/esle compare with switch/case
    public static Phone product(String type)  {
        Phone phone=null;
        switch (type){
            case "apple":  phone=new ApplePhone(); break;
            case "huawei": phone=new HuaweiPhone(); break;
            default:return phone=null;
        }
        return phone;
    }

}
