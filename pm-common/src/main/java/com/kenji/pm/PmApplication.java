package com.kenji.pm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class PmApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmApplication.class, args);
    }
}
