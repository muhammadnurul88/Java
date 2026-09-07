package Internationalization.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;


@Configuration
public class Appconfig {

    @Bean(name="messageSource")  //messageSource is the fixed bean id
    public ResourceBundleMessageSource createRBMS() {
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasename("commons1/App");
        return source;
    }
}
