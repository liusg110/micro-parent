package com.xy.client1.proxy;

import java.util.Date;

/**
 * FileName: proxySourceOrderApiImpl
 * Author: liusg
 * Date: 2019-02-14 18:18
 * Desc: 代理模式，和原对象实现相同接口，需要再老的接口中添加权限控制
 *
 * 现在我们公司的系统又要进行升级，我们原先的接口没有加入安全机制，
 * 导致了任何人都可以随意调用这个接口，现在公司需要对这个接口进行改造，只其只能被admin这个客户端调用，其他用户一律要输入账号密码才能调用
 *
 *   fixme 这里就会显出代理模式和适配器模式最大的区别，代理模式是与原对象实现同一个接口，而适配器类则是匹配新接口，说白了，实现一个新的接口。
 */

public class proxySourceOrderApiImpl implements SourceOrderApi{
    private SourceOrderApi sourceOrderApi;

    public proxySourceOrderApiImpl(){
        sourceOrderApi=new SourceOrderApiImpl();
    }

    @Override
    public void updateDate(String orderId, String client, Date date) {
        // fixme 进行判断，如果是admin则更新否则让其输入账号密码
        if("admin".equals(client)){
            sourceOrderApi.updateDate(orderId,client,date);
        }else{
            System.out.println("账号不是admin，没有查询权限，请输入以admin操作");
        }
    }
}
