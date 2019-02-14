package com.xy.client1.decorator;

/**
 * FileName: Decorator
 * Author: liusg
 * Date: 2019-02-14 17:47
 * Desc: 装饰者
 *  适配器的特点在于{兼容}，从代码上的特点来说，适配类与原有的类具有相同的接口，并且持有新的目标对象。
 *
 * 就如同一个三孔转2孔的适配器一样，他有三孔的插头，可以插到三孔插座里，又有两孔的插座可以被2孔插头插入。
 *
 * 适配器模式是在于对原有3孔的改造。
 *
 * 在使用适配器模式的时候，我们必须同时持有原对象，适配对象，目标对象。。。。
 *
 *
 *
 * 装饰器模式特点在于【增强】，他的特点是被装饰类和所有的装饰类必须实现同一个接口，而且必须持有被装饰的对象，可以无限装饰。
 *
 *
 *
 * 代理模式的特点在于【隔离】，隔离调用类和被调用类的关系，通过一个代理类去调用。
 *
 *
 *
 * 总的来说就是如下三句话：
 *  1 适配器模式是将一个类(a)通过某种方式转换成另一个类(b).
 *  2 装饰模式是在一个原有类(a)的基础之上增加了某些新的功能变成另一个类(b).
 *  3 代理模式是将一个类(a)转换成具体的操作类(b).
 */

public class Decorator implements Source{

    private Source source;

    public Decorator(){
        this.source=new SourceImpl();
    }

    public void decorate1(){
        System.out.println("decorate1");
    }
    @Override
    public void sourceMethod() {
            decorate1();
            source.sourceMethod();
    }
}
