package in.MessageGeneratorDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependecyInjectionTest {

    public static void main(String[] args) {

        // Create IOC container
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfi1.class);

        // get target spring bean class object ref

        WishMessageGenerator wish = (WishMessageGenerator) ctx.getBean("wmg");

        // invoke b.method

        String result = wish.generateWishMessage("nurul");
        System.out.println(result);

        // close IOC container

    }
}
