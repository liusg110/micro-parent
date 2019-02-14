package com.xy.client1.adapter.integerfaceAdapter;

/**
 * FileName: Adapter
 * Author: liusg
 * Date: 2019-02-14 16:00
 * Desc: integerfaceAdapter
 * 接口适配器使用场景：
 *
 * 　　想要使用接口中的某个或某些方法，但是接口中有太多方法，我们要使用时必须实现接口并实现其中的所有方法，
 *     可以使用抽象类来实现接口，并不对方法进行实现（仅置空），然后我们再继承这个抽象类来通过重写想用的方法的方式来实现。这个抽象类就是适配器。
 */

public abstract class Adapter implements A{

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }

    @Override
    public void e() {

    }

    @Override
    public void f() {

    }
}
