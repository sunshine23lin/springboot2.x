package com.lwt.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringbootApplication {
    public SpringbootApplication(Environment environment) {
        String env = environment.getProperty("test.env");
        System.out.println(env);
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
