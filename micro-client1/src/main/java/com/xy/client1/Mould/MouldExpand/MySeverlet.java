package com.xy.client1.Mould.MouldExpand;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
public class MySeverlet implements HttpSeverlet{

    @Override
    public void doPost() {
        System.out.println("执行自定义doPost");
    }

    @Override
    public void doGet() {
        System.out.println("执行自定义doGet");
    }


}
