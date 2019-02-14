package com.xy.client1.proxy;

import java.util.Date;

public interface SourceOrderApi {
    //fixme 老接口，需要传入三个参数
    public void updateDate(String orderId,String client,Date date);
}
