package com.springboot.rabbit.publisher.controller;


import com.springboot.rabbit.publisher.domain.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMqController {
    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public RabbitMqController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping("/user")
    public String sendUser(@RequestBody User user) {
        rabbitTemplate.convertAndSend("springboot.test.topic", "springboot.topic.random.placeholder", user);
        return "user sent";
    }
}
