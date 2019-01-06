package com.xy.client1.Builder;

import com.xy.client1.Builder.Impl.ManBuilder;
import com.xy.client1.Builder.Impl.WomenBuilder;
import com.xy.client1.doman.po.PersonPo;

/**
 * FileName: TestBuilder
 * Author: liusg
 * Date: 2018-12-20 18:59
 * Desc:
 * 需要生成的产品对象有复杂的内部结构，这些产品对象通常包含多个成员属性
 * 构建的过程允许对构建的对象进行不同的表示
 * 实例：
 * java.lang.StringBuilder
 * java.lang.StringBuffer
 */

public class TestBuilder {


    public static void main(String[] args) {
        PersonDirector pd=new PersonDirector();
        PersonPo personPo1 = pd.constructPerson(new WomenBuilder());
        System.out.println(personPo1.getHead()+personPo1.getBody()+personPo1.getFoot());
    }
}
