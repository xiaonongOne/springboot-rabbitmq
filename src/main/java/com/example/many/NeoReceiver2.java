package com.example.many;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: springboot-rabbitmq
 * @Package: com.example.many
 * @ClassName: NeoReceiver2
 * @Description: 接收者
 * @Author: Xiao Nong
 * @Version: 1.0
 */
@Component
@RabbitListener(queues = "neo")
public class NeoReceiver2 {


    @RabbitHandler
    public void process(String neo) {
        System.out.println("Receiver 2: " + neo);
    }

}
