package com.lxf.ddd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DDDApplication {

    public static void main(String[] args) {
        SpringApplication.run(DDDApplication.class, args);
    }
}