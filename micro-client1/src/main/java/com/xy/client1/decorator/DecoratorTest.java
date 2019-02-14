package com.xy.client1.decorator;

/**
 * FileName: DecoratorTest
 * Author: liusg
 * Date: 2019-02-14 17:56
 * Desc:
 */

public class DecoratorTest {
    public static void main(String[] args) {
        Source source=new Decorator();
        source.sourceMethod();
    }

}
