package com.lqc.vue.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@MapperScan("com.lqc.vue.dao.dao")
@ComponentScan(basePackages = {"com.lqc.vue.*"})
public class VueAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(VueAdminApplication.class, args);
    }
}
