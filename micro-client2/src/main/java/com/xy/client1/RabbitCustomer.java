package com.xy.client1;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * FileName: RabbitCustomer
 * Author: liusg
 * Date: 2018-11-15 18:04
 * Desc:
 */
@Component
public class RabbitCustomer {
    @RabbitListener(queues = "QUEUE1")
    public void customer1(String msg){
        System.out.println("消费者1："+msg);
    }

    @RabbitListener(queues = "QUEUE2")
    public void customer2(String msg){
        System.out.println("消费者2："+msg);
    }


    @RabbitListener(queues = "DL_QUEUE")
    public void customer3(String msg){
        System.out.println("消费者3："+msg+"----时间为："+System.currentTimeMillis());
    }


    @RabbitListener(queues = "REDIRECT_QUEUE")
    public void customer4(String msg){
        System.out.println("消费者4："+msg+"----时间为："+System.currentTimeMillis());
    }




    @RabbitListener(queues = "DIRECTQUEUE")
    public void customer5(String msg){
        System.out.println("消费者5："+msg);
    }

    @RabbitListener(queues = "DIRECTQUEUE")
    public void customer6(String msg){
        System.out.println("消费者6："+msg);
    }


}
