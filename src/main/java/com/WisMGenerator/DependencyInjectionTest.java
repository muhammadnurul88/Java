package com.WisMGenerator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        // create IOC container
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        // get target spring bean class obj
        WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
        WishMessageGenerator generator1 = ctx.getBean("wmg",WishMessageGenerator.class);
        WishMessageGenerator generator2 = ctx.getBean("wmg",WishMessageGenerator.class);

        System.out.println(generator.hashCode()+"-"+generator1.hashCode()+"-"+generator2.hashCode());
        System.out.println("gen1 == gen2" + (generator1 == generator2));
        System.out.println("gen == gen1" + (generator == generator1));

        LocalDateTime ldt3 = ctx.getBean("dt",LocalDateTime.class);
        LocalDateTime ldt4 = ctx.getBean("dt1",LocalDateTime.class);
        System.out.println(ldt3.hashCode()+"--"+ldt4.hashCode());
    }
}
