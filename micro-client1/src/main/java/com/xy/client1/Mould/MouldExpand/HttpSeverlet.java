package com.xy.client1.Mould.MouldExpand;

/**
 * @author xiaoyao
 * @Description: 用接口代替抽象类实现模板方法模式，jdk1.8 提供了default接口方法，可以写实现
 */
public interface HttpSeverlet {

    void doPost();

    void doGet();

    default void service() {
        System.out.println("此处模拟Servlet中实现的service方法，根据req中方法的类型执行固定的代码");
        doPost();
        doGet();
    }
}
