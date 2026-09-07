package Internationalization.client;

import Internationalization.config.Appconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;
import java.util.Scanner;

public class SpringI18nTest {

    public static void main(String[] args) throws Exception {
        // create IOC container
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);

        // read language code and entry code from the enduser

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter language code:");
        String lang = sc.next();

        System.out.println("Enter Country code:");
        String country = sc.next();


        // prepare locale object having language code + country code
        Locale locale = new  Locale(lang, country);


        // read the message from Locale specific properts file using ctx.getMessage()
        String msg1 = ctx.getMessage("wish.msg", new Object[] {"husky"}, locale);
        String msg2 = ctx.getMessage("missing.msg", new Object[] {}, locale);
        String msg3 = ctx.getMessage("goodbye.msg", new Object[] {}, locale);
        String msg4 = ctx.getMessage("disconnect.msg", new Object[] {}, locale);

        System.out.println(msg1+" "+msg2+" "+msg3+" "+msg4);

        ctx.close();

    }
}

