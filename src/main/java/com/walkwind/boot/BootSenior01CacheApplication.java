package com.walkwind.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class BootSenior01CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootSenior01CacheApplication.class, args);
    }

}
