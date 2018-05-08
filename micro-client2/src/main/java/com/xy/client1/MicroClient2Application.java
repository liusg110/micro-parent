package com.xy.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroClient2Application.class, args);
    }
}
