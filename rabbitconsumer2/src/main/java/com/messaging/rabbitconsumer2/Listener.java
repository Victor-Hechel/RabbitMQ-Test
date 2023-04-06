package com.messaging.rabbitconsumer2;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @RabbitListener(queues = "rabbitmqproducer.topic-created.consumer2")
    public void listenUsuario(Usuario usuario) {
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
    }
}
