package com.example.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo13Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo13Application.class, args);
    }

    @RabbitListener(queues = "hoge")
    public void listen (String in){
        System.out.println("queue is "+ in);
    }

}
