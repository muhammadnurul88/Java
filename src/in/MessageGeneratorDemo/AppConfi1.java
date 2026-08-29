package in.MessageGeneratorDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;


@Configuration
@ComponentScan
public class AppConfi1 {


    public AppConfi1() {
        System.out.println("0- param Constructor");
    }
    @Bean
    public LocalTime createLTime(){
        System.out.println("AppConfig- createLTime()");
        return LocalTime.now();
    }

    @Bean
    public LocalDate createLDate(){
        System.out.println("AppConfig- createLDate()");
        return LocalDate.now();
    }
}
