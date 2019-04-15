package com.utiltech.laundry.services;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages = "com.utiltech.laundry.services")
@Configuration
public class LOSApplication {

    public static void main(String[] args) {
        SpringApplication.run(LOSApplication.class, args);
    }

}