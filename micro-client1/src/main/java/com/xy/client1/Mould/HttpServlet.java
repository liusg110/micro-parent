package com.xy.client1.Mould;



/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: 抽象模板方法，其中有多个方法，其他分为模板方法和基本方法，模板方法由抽象类实现
 * 基本方法由具体的模板角色担任，模拟HTTPServlt 方法
 * @date ${date} ${time}
 * ${tags}
 */
public abstract class HttpServlet {
    //抽象基本方法，由子类实现，抽象方法无方法体
    protected abstract void doPost();
    //抽象基本方法，由子类实现，抽象方法无方法体
    protected abstract void doGet();


    //钩子方法，子类不需要实现
    protected void service(){

        System.out.println("此处模拟Servlet中实现的service方法，根据req中方法的类型执行固定的代码");
        doPost();
        doGet();
    }
}
