package com.xy.client1.Builder;

import com.xy.client1.Builder.Impl.ManBuilder;
import com.xy.client1.Builder.Impl.WomenBuilder;
import com.xy.client1.doman.po.PersonPo;

/**
 * FileName: TestBuilder
 * Author: liusg
 * Date: 2018-12-20 18:59
 * Desc:
 */

public class TestBuilder {


    public static void main(String[] args) {
        PersonDirector pd=new PersonDirector();
        PersonPo personPo1 = pd.constructPerson(new WomenBuilder());
        System.out.println(personPo1.getHead()+personPo1.getBody()+personPo1.getFoot());
    }
}
