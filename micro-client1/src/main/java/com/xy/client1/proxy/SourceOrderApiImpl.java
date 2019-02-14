package com.xy.client1.proxy;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * FileName: AppOrderApiImpl
 * Author: liusg
 * Date: 2019-02-14 18:13
 * Desc:
 */

public class SourceOrderApiImpl implements SourceOrderApi{

    //老的接口实现类
    @Override
    public void updateDate(String orderId, String client, Date date) {
        System.out.println(client+"已将订单"+orderId+"的有效期延长至"+date);
    }

}
