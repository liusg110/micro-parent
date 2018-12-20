package com.xy.client1.Builder.Impl;

import com.xy.client1.Builder.PersonBuilder;
import com.xy.client1.doman.po.PersonPo;

/**
 * FileName: WomenBuilder
 * Author: liusg
 * Date: 2018-12-20 18:54
 * Desc:
 */

public class WomenBuilder implements PersonBuilder {
    private PersonPo personPo;

    public WomenBuilder() {
        personPo=new PersonPo();
    }

    @Override
    public void buildHead() {
        personPo.setHead("我是女人的头部");
    }

    @Override
    public void buildBody() {
        personPo.setBody("我是女人的身体");
    }

    @Override
    public void buildFoot() {
        personPo.setFoot("我是女人的脚");
    }

    @Override
    public PersonPo buildPerson() {
        return personPo;
    }
}
