package com.amazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource("classpath:ApplicationContext.xml")
public class SpringBootProjectApplication {

    public static void main(String[] args) {
        // get access IOC container
      ApplicationContext ctx = SpringApplication.run(SpringBootProjectApplication.class, args);

      // get target spring bean class obj ref
        Vehicle vehicle = ctx.getBean("vehicle", Vehicle.class);
        // invok the b.method
        vehicle.journey("Bengaluru", "Pune");


        // close ioc container
        ((ConfigurableApplicationContext)ctx).close();
    }
}
