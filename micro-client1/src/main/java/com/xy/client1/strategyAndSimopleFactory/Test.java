package com.xy.client1.strategyAndSimopleFactory;

import java.nio.ByteBuffer;
import java.util.Iterator;

/**
 * FileName: Test
 * Author: liusg
 * Date: 2019-02-15 15:18
 * Desc: 策略模式和简单工厂模式组合,
 *
 * 思考，根据不同的金额来执行不同的策略
 *      根据不同的会员级别、消费金额来执行不同的策略
 */

public class Test {
    public static void main(String   [] abd) {
        Context context=new Context("B");
        context.summery();


        System.out.println(Context.testEmun(StrategyEnum.D));

    }

}
