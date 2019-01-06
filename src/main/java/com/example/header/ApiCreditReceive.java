package com.example.header;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: demo
 * @Package: com.example.header
 * @ClassName: ApiCreditReceive
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */

@Component
public class ApiCreditReceive {

    @RabbitHandler
    @RabbitListener(queues = "credit.bank")
    public void creditBank(String msg) {
        System.out.println("credit.bank receive message: "+msg);
    }

    @RabbitHandler
    @RabbitListener(queues = "credit.finance")
    public void creditFinance(String msg) {
        System.out.println("credit.bank receive message: "+msg);
    }
}
