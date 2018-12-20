package com.xy.client1.Builder;

import com.xy.client1.doman.po.PersonPo;

/**
 * FileName: PersonDirector
 * Author: liusg
 * Date: 2018-12-20 18:57
 * Desc:
 */

public class PersonDirector {

    public PersonPo constructPerson(PersonBuilder pb){
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();

        return pb.buildPerson();
    }

}
