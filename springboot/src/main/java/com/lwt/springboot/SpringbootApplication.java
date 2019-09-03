package com.lwt.springboot;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringbootApplication {
    Logger logger = LoggerFactory.getLogger(getClass());
    public SpringbootApplication(Environment environment) {
        // 日志级别 trace<debug<info<warn<error
        logger.trace("这是trace");
        logger.debug("这是debug");
        logger.info("这是info");
        logger.warn("这是warn");
        logger.error("这是error");
        String env = environment.getProperty("test.env");
        System.out.println(env);
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
