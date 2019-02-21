package com.xy.client1.Mould;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: 设计模式之模板方法模式测试
 * @date ${date} ${time}
 * ${tags}
 */
public class TestMould {

    public static void main(String[] args) {
        HttpServlet servlet=new MyServlet();
        servlet.service();
    }

}
