import com.nt.sbeans1.WishMessageGenerator1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionTest1 {
    public static void main(String[] args) {
        // create IOC container
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext1.xml");
        // get target spring bean class object ref from the IOC container
        Object obj = ctx.getBean("wmg");

        // type casting
        WishMessageGenerator1 generator = (WishMessageGenerator1)obj;

        // invoke the b.method

        String result = generator.generateWishMessage("nurul");
        System.out.println(result);
        // close the IOC container
        ctx.close();
    }
}
