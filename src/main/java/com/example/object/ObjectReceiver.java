package com.example.object;

import com.example.bean.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: springboot-rabbitmq
 * @Package: com.example.object
 * @ClassName: ObjectReceiver
 * @Description: 对象接收者
 * @Author: Xiao Nong
 * @Version: 1.0
 */
@Component
@RabbitListener(queues = "object")
public class ObjectReceiver {

    @RabbitHandler
    public void process(User user) {
        System.out.println("Receiver object : " + user);
        System.out.println("username:"+user.getUsername());
        System.out.println("password:"+user.getPassword());
    }
}
