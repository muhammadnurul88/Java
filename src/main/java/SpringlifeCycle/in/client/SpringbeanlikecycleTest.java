package SpringlifeCycle.in.client;

import SpringlifeCycle.in.config.Appconfig;
import SpringlifeCycle.in.sbeans.ChekingVotingEligbility;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringbeanlikecycleTest {

   public static void main(String[] args) throws Exception {

       // create IOC container first
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);

       // get terget spring bean object ref
       ChekingVotingEligbility voter = ctx.getBean("voter", ChekingVotingEligbility.class);

       // invoke the b.method
       try {
           String result = voter.checkElgibility();
           System.out.println(result);
       }catch (Exception e){
           e.printStackTrace();
       }

       ctx.close();
   }
}
