package com.xy.client1.adapter.objectAdapter;

import com.xy.client1.adapter.classAdapter.Usb;

/**
 * FileName: UsbImpl
 * Author: liusg
 * Date: 2019-02-14 14:58
 * Desc: usb接口实现类
 */

public class UsbImpl implements Usb {

    @Override
    public void isUsb() {
        System.out.println("USB口");
    }
}
