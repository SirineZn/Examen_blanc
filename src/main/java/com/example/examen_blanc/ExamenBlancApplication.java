package com.example.examen_blanc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy
public class ExamenBlancApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenBlancApplication.class, args);
    }

}
