package com.xy.client1.adapter.objectAdapter;

/**
 * FileName: TestObjectAdapter
 * Author: liusg
 * Date: 2019-02-14 15:54
 * Desc: 对象适配器测试类
 */

public class TestObjectAdapter {
    public static void main(String[] args) {
        Ps2 p=new Adapter(new USB());
        p.isPs2();
    }
}
