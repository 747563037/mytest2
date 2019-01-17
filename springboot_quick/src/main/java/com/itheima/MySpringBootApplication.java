package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.itheima")
public class MySpringBootApplication {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(MySpringBootApplication.class)

                .run(args);

        



    }
}
