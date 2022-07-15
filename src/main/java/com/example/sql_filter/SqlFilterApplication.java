package com.example.sql_filter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.example.sql_filter.mapper")
@SpringBootApplication
public class SqlFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqlFilterApplication.class, args);
    }

}
