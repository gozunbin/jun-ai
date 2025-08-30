package com.jun.junai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jun.junai.mapper")
public class JunAiApplication {

    public static void main(String[] args) {
        SpringApplication.run(JunAiApplication.class, args);
    }

}
