package com.xy.client1.adapter.integerfaceAdapter;

/**
 * FileName: Test
 * Author: liusg
 * Date: 2019-02-14 16:04
 * Desc: 接口适配器测试类
 */

public class Test {
    public static void main(String[] args) {
        A a = new AImpl();
        a.a();
        a.b();
        a.c();
    }

}
