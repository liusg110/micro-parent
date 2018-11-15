package com.xy.client1;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * FileName: RabbitClent
 * Author: liusg
 * Date: 2018-11-15 14:13
 * Desc: RabbitMq生产者测试类
 */
@Component
public class RabbitClent {


    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sendForTopic() {
        for(int i=0;i<50;i++){
            System.out.println("hello,I'm "+ i);
            this.rabbitTemplate.convertAndSend("topic_exchange","topic.message1","hello----"+i);
        }
    }



    public void sendMsForDead(String content) {
        CorrelationData correlationId = new CorrelationData(UUID.randomUUID().toString());
        MessagePostProcessor messagePostProcessor = message -> {
            MessageProperties messageProperties = message.getMessageProperties();
//            设置编码
            messageProperties.setContentEncoding("utf-8");
//            设置过期时间10*1000毫秒
            messageProperties.setExpiration("10000");
            return message;
        };
        rabbitTemplate.convertAndSend("DL_EXCHANGE", "DL_KEY", content, messagePostProcessor);
    }


    public void sendForDirect() {
        for(int i=0;i<50;i++){
            System.out.println("hello,I'm "+ i);
            this.rabbitTemplate.convertAndSend("DIRECTEXCHANGE","DIRECTKEY","hello----"+i);
        }
    }


}
