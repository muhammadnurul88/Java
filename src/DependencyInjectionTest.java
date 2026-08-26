import com.nt.main.WishMessageGenerator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionTest {

    public static void main(String[] args) {

        System.out.println("DependencyInjectionTest.main().start");

        // Create IOC container
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // Get target Spring bean
        Object obj = ctx.getBean("wmg");

        // Type casting
        WishMessageGenerator generator = (WishMessageGenerator) obj;

        // Invoke business method
        String result = generator.generateWishMessage("nurul");

        System.out.println(result);

        // Close IOC container
        ctx.close();
    }
}