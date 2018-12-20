package com.xy.client1.Builder.Impl;

import com.xy.client1.Builder.PersonBuilder;
import com.xy.client1.doman.po.PersonPo;

/**
 * FileName: ManBuilderImpl
 * Author: liusg
 * Date: 2018-12-20 18:51
 * Desc:
 */

public class ManBuilder implements PersonBuilder {

    private PersonPo personPo;

    public ManBuilder() {
        personPo=new PersonPo();
    }

    @Override
    public void buildHead() {
        personPo.setHead("我是男人的头部");
    }

    @Override
    public void buildBody() {
        personPo.setBody("我是男人的身体");
    }

    @Override
    public void buildFoot() {
        personPo.setFoot("我是男人的脚");
    }

    @Override
    public PersonPo buildPerson() {
        return personPo;
    }
}
