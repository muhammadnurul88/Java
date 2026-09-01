package StrategyDPSpringComs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StrategyDpTest {

    public static void main(String[] args) {
        // create IOC container
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        // get target spring bean class object
        Flipkart fpkt = ctx.getBean("flipkart", Flipkart.class);

        // invoke bussines method
        String msg = fpkt.shopping(new String[]{"Shirt", "trauser", "shoes", "jeans"}, new double[]{3000.0, 4000.0, 5000.0, 4000.0});

        System.out.println(msg);
        // close the IOC container
        ctx.close();
    }
}
