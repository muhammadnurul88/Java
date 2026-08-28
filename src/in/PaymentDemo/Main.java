package in.PaymentDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConifg.class);

        User i = context.getBean(User.class);
        System.out.println(i.getName());

        OrderService order = context.getBean(OrderService.class);
        order.PlaceOrder();


    }
}
