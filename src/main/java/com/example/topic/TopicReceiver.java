package com.example.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: springboot-rabbitmq
 * @Package: com.example.topic
 * @ClassName: TopicReceiver
 * @Description:
 * @Author: Xiao Nong
 * @Version: 1.0
 */
@Component
@RabbitListener(queues = "topic.message")
public class TopicReceiver {


    @RabbitHandler
    public void process(String message) {
        System.out.println("Topic Receiver1  : " + message);
    }
}
