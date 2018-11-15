package com.xy.client1.config;


import com.rabbitmq.client.AMQP;
import com.xy.client1.contant.MqEnum;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.BindingType;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/**
 * FileName: RabbitConfig
 * Author: liusg
 * Date: 2018-11-15 14:29
 * Desc: RabbitMq消息队列
 */
@Configuration
public class RabbitConfig {

    /**
     * @ Desc: 队列1
     */
    @Bean(name = "queue1")
    public Queue queueMessage1() {
        return new Queue("QUEUE1");    //topic_message1 表示队列名称，与路由key对比，决定路由到哪个队列
    }

    /**
     * @ Desc: 队列2
     */
    @Bean(name = "queue2")
    public Queue queueMessage2() {
        return new Queue("QUEUE2");
    }

    /**
     * @ Desc: 主题交换机
     */
    @Bean(name = "exchange")
    public TopicExchange exchange() {
        return new TopicExchange("topic_exchange");   //topic_exchange1:交换机名称，发送消息的时候需要指定
    }


    /**
     * @ Desc: 将队列和交换机1绑定  并指定routingKey 为 topic.message1
     */
    @Bean
    Binding bindingExchangeMessage(@Qualifier("queue1") Queue queueMessage, @Qualifier("exchange") TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message1");
    }

    /**
     * @ Desc: 将队列和交换机2绑定  并指定routingKey 为 topic.*
     */
    @Bean
    Binding bindingExchangeMessage2(@Qualifier("queue2") Queue queueMessage, @Qualifier("exchange") TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message1");
    }









    /*-------------------------死信队列------------------------------------------------------*/
    @Bean(name="deadLetterExchange")
    public Exchange deadLetterExchange(){
        return ExchangeBuilder.directExchange("DL_EXCHANGE").durable(true).build();
    }


    @Bean(name = "deadLetterQueue")
    public Queue deadLetterQueue(){
        Map<String,Object> args=new HashMap<>();
        args.put("x-dead-letter-exchange","DL_EXCHANGE");
        args.put("x-dead-letter-routing-key","KEY_R");
        return QueueBuilder.durable("DL_QUEUE").withArguments(args).build();


    }

    @Bean("redirectQueue")
    public Queue redirectQueue() {
        return QueueBuilder.durable("REDIRECT_QUEUE").build();
    }




    @Bean
    public Binding deadLetterBinding() {
        return new Binding("DL_QUEUE", Binding.DestinationType.QUEUE, "DL_EXCHANGE", "DL_KEY", null);

    }


    @Bean
    public Binding redirectBinding() {
        return new Binding("REDIRECT_QUEUE", Binding.DestinationType.QUEUE, "DL_EXCHANGE", "KEY_R", null);
    }



    @Bean
    public Exchange directExchange(){
        return ExchangeBuilder.directExchange("DIRECTEXCHANGE").durable(true).build();
    }


    @Bean
    public Queue directQueue() {
        return QueueBuilder.durable("DIRECTQUEUE").build();
    }

    @Bean
    public Binding directBinding(){
        return new Binding("DIRECTQUEUE",Binding.DestinationType.QUEUE,"DIRECTEXCHANGE","DIRECTKEY",null);
    }

}







