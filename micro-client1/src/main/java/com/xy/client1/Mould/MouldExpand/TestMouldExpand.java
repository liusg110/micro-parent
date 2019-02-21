package com.xy.client1.Mould.MouldExpand;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: 用接口代替抽象类实现模板方法模式，因为jdk1.8支持默认的方法实现，可以不被子类实现
 * @date ${date} ${time}
 * ${tags}
 */
public class TestMouldExpand {
    public static void main(String[] args) {
        HttpSeverlet s=new MySeverlet();
        s.service();
    }
}
