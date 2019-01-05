package com.example.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: springboot-rabbitmq
 * @Package: com.example.fanout
 * @ClassName: FanoutReceiverC
 * @Description:
 * @Author: Xiao Nong
 * @Version: 1.0
 */
@Component
@RabbitListener(queues = "fanout.C")
public class FanoutReceiverC {


    @RabbitHandler
    public void process(String message) {
        System.out.println("fanout Receiver C: " + message);
    }

}
