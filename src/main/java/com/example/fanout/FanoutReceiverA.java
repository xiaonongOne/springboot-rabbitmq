package com.example.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: springboot-rabbitmq
 * @Package: com.example.fanout
 * @ClassName: FanoutReceiverA
 * @Description:
 * @Author: Xiao Nong
 * @Version: 1.0
 */
@Component
@RabbitListener(queues = "fanout.A")
public class FanoutReceiverA {

    @RabbitHandler
    public void process(String message) {
        System.out.println("fanout Receiver A  : " + message);
    }
}
