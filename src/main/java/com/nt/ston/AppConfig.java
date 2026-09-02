package com.nt.ston;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean(name = "prn1")
    public Printer createPrinter1() {
        return Printer.getInstance();
    }

    @Bean(name = "prn2")
    public Printer createPrinter2() {
        return Printer.getInstance();
    }
}
