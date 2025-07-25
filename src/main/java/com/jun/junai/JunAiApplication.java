package com.jun.junai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootApplication
public class JunAiApplication {

    public static void main(String[] args) {
        SpringApplication.run(JunAiApplication.class, args);
    }

}
