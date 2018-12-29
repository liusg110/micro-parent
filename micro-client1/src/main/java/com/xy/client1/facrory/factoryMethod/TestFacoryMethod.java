package com.xy.client1.facrory.factoryMethod;

/**
 * FileName: TestFacoryMethod
 * Author: liusg
 * Date: 2018-12-29 17:34
 * Desc: 工厂方法测试类
 */

public class TestFacoryMethod {
    public static void main(String[] args) {
        HuaweiFactory huaweiFactory=new HuaweiFactory();
        huaweiFactory.productPhone();
        AppleFactory appleFactory=new AppleFactory();
        appleFactory.productPhone();

        /*一个大的项目可能需要实例化的东西太多，如果用简单工厂模式的话要不停的去修改工厂类，
        这样就不符合开发封闭原则，而且也很不合理，而使用工厂方法模式，只需要扩展相应的工厂类即可，
        不需要修改原有的代码，这样的代码才会更健壮*/
    }
}
