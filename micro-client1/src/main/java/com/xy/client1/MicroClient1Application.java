package com.xy.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroClient1Application.class, args);
    }
}
