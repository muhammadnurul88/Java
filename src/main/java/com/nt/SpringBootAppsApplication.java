package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class SpringBootAppsApplication {

    @Bean(name = "id")
    public LocalDate createDate(){
        return LocalDate.now();
    }

    public static void main(String[] args) {
        // get IOC container
       ApplicationContext ctx = SpringApplication.run(SpringBootAppsApplication.class);

       // get target Spring bean class object
        SeasonFinder finder = ctx.getBean("sf", SeasonFinder.class);

        // invok the business method
        String SeasonName = finder.findSeason();
        System.out.println("SeasonName:"+SeasonName);

        // close the IOC container by type casting
        ((ConfigurableApplicationContext)ctx).close();

    }
}
