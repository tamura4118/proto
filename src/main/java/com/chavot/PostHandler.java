package com.chavot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

@SpringBootApplication
public class PostHandler implements RequestHandler<Object, Object>{

    @Override
    public Object handleRequest(Object input, Context context) {
        String args[] = new String[0];
        try (ConfigurableApplicationContext ctx = SpringApplication.run(PostHandler.class, args)) {
            PostHandler app = ctx.getBean(PostHandler.class);
            app.run(args);
            return "success.";
        } catch (Exception e) {
            e.printStackTrace();
            context.getLogger().log("error.\n");
            return "error.";
        }
    }

    public void run(String... args) throws Exception {
        SpringApplication.run(ChavotApplication.class, args);
    }
}