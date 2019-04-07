package com.xy.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(value = "com.xy")
@ServletComponentScan("com.xy")
//@EnableEurekaClient
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class MicroClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroClient1Application.class, args);
    }
}
