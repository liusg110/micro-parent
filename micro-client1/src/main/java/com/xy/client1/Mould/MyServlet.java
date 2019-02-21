package com.xy.client1.Mould;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
public class MyServlet extends HttpServlet{
    @Override
    protected void doPost() {
        System.out.println("执行自定义doPost");
    }

    @Override
    protected void doGet() {
        System.out.println("执行自定义doGet");
    }
}
