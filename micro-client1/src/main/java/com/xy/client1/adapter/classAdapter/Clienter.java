package com.xy.client1.adapter.classAdapter;

/**
 * FileName: Clienter
 * Author: liusg
 * Date: 2019-02-14 15:09
 * Desc:
 *  类适配器
 *  原理：通过继承来实现适配器功能。
 *
 * 　　当我们要访问的接口A中没有我们想要的方法  ，我们又不能改变访问接口A，在这种情况下，我们可以定义一个适配器p来进行中转，这个适配器p要实现我们访问的接口A，这样我们就能继续访问当前接口A中的方法（虽然它目前不是我们的菜），然后再继承接口B的实现类BB，这样我们可以在适配器P中访问接口B的方法了，这时我们在适配器P中的接口A方法中直接引用BB中的合适方法，这样就完成了一个简单的类适配器。
 *
 * 　　详见下方实例：我们以ps2与usb的转接为例
 * 实例讲解：
 *
 * 　　我手中有个ps2插头的设备，但是主机上只有usb插头的插口，怎么办呢？弄个转换器，将ps2插头转换成为USB插头就可以使用了。
 *
 * 　　接口Ps2：描述ps2接口格式
 *
 * 　　接口Usb：描述USB接口格式
 *
 * 　　类Usber：是接口Usb的实现类，是具体的USB接口格式
 *
 * 　　Adapter：用于将ps2接口格式转换成为USB接口格式
 */

public class Clienter {
    public static void main(String[] args) {
        Ps2 p=new Adapter();
        p.isPs2();
    }
}
