package com.example.rabbbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ProjectName: springboot-rabbitmq
 * @Package: com.example.rabbbit
 * @ClassName: HelloSender
 * @Description: 发送者
 * @Author: Xiao Nong
 * @Version: 1.0
 */
@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }
}
