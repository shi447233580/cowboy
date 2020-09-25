package com.cowboy.cowboy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan(basePackages="com.cowboy.cowboy.dao")
public class CowboyApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CowboyApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CowboyApplication.class);
    }

}
