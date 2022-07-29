package com.example;

import org.apache.servicecomb.springboot2.starter.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@EnableServiceComb
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}