package com.lwt.springboot;


import org.junit.Test;
import org.junit.runner.RunWith;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {
        // 日志级别 trace<debug<info<warn<error
        logger.trace("这是trace");
        logger.debug("这是debug");
        logger.info("这是info");
        logger.info("这是warn");
        logger.info("这是error");

    }

}
