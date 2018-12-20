package com.xy.client1.Builder;

import com.xy.client1.doman.po.PersonPo;

public interface PersonBuilder {//抽象接口，思考：如果将接口变为抽象类，那么实现、应用场景有什么不同

    void buildHead();
    void buildBody();
    void buildFoot();
    PersonPo buildPerson();//组装
}
