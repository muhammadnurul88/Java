package com.WisMGenerator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDateTime;

@Configuration
@ComponentScan
public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfig - no-param Constructor");
    }
    @Bean("dt")
    @Scope("singleton")
    public LocalDateTime createLTD() {
        System.out.println("AppConfig - createLTD");
        return LocalDateTime.now();
    }

    @Bean("dt1")
    @Scope("singleton")
    public LocalDateTime createLTD2() {
        System.out.println("AppConfig - createLTD");
        return LocalDateTime.now();
    }
}
