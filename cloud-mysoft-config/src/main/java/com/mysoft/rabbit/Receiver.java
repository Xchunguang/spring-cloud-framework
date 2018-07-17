package com.mysoft.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues="hello",containerFactory="rabbitListenerContainerFactory")
public class Receiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("receiver:"+hello);
    }
}
