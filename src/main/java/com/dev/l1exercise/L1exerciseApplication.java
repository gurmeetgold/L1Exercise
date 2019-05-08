package com.dev.l1exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.dev.l1exercise.model")
public class L1exerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(L1exerciseApplication.class, args);
    }

}
