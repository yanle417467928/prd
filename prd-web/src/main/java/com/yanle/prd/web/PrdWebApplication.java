package com.yanle.prd.web;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class, scanBasePackages = "com.yanle.prd")
@EnableDubboConfiguration
public class PrdWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrdWebApplication.class, args);
    }
}
