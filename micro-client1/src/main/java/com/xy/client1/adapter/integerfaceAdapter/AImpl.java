package com.xy.client1.adapter.integerfaceAdapter;



/**
 * FileName: AImpl
 * Author: liusg
 * Date: 2019-02-14 16:01
 * Desc: A的实现类，通过适配器进行调整
 */

public class AImpl extends Adapter {
    public void a(){
        System.out.println("实现A的方法调用");
    }

    public void b(){
        System.out.println("实现b的方法调用");
    }

}
