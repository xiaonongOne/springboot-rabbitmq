package com.example.object;

import com.example.bean.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: demo
 * @Package: com.example.object
 * @ClassName: ObjectSender
 * @Description: 对象发送者
 * @Author: Xiao Nong
 * @Version: 1.0
 */


@Component
public class ObjectSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(User user) {
        System.out.println("Sender object: " + user.toString());
        this.rabbitTemplate.convertAndSend("object", user);
    }
}
