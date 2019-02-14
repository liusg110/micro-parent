package com.xy.client1.adapter.classAdapter;

/**
 * FileName: Adapter
 * Author: liusg
 * Date: 2019-02-14 15:07
 * Desc: 类适配器
 */

public class Adapter extends UsbImpl implements Ps2{

    @Override
    public void isPs2() {
        System.out.println("Usb接口");
    }
}
