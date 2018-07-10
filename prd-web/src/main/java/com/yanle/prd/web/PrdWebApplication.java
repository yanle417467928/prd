package com.yanle.prd.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class,scanBasePackages = "com.yanle.prd")
@MapperScan(basePackages = "com.yanle.prd.dao")
public class PrdWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrdWebApplication.class, args);
    }
}
