package com.chavot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ChavotApplication {
    private static final Logger logger = LoggerFactory.getLogger(ChavotApplication.class);

    public static void main(String[] args) {
        System.out.print("------ START ------");
        String value = System.getenv("test");
        String bbbb = System.getenv("bbbb");
        String fbToken = System.getenv("FB_TOKEN");
        logger.info("test value : " + value);
        logger.info("bbbb value : " + bbbb);
        logger.info("FBTOKEN value : " + fbToken);
        SpringApplication.run(ChavotApplication.class, args);
    }
}
