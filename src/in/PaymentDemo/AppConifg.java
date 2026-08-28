package in.PaymentDemo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.PaymentDemo")
public class AppConifg {

    @Bean
    public User createUser() {
        return new User("nurul", 25);
    }
}
