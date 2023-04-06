package com.messaging.rabbitproducer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teste")
public class TestController {

    private RabbitTemplate rabbitTemplate;

    public TestController(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }

    @GetMapping
    public void test(@RequestBody Usuario user){

        rabbitTemplate.convertAndSend("rabbitmqproducer.topic-created", "", user);
    }
}
