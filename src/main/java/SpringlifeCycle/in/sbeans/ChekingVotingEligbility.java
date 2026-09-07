package SpringlifeCycle.in.sbeans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component("voter")
@PropertySource("classpath:commons/properties")
public class ChekingVotingEligbility {

    @Value("${voter.id}")
    private Integer id;

    @Value("${voter.name}")
    private String name;

    @Value("${voter.age}")
    private Integer age;

    private Date verifiedOn;


    public ChekingVotingEligbility() {
        System.out.println("0-param constructor");
    }

    // post constructor init lifecycle methods
    public void myInit(){
        System.out.println("ChekingVotingEligbility: myInit()");

        // initialize the left over properties that had not participate in the injection
        verifiedOn = new Date();

        // validation logics
        if (name == null || age <= 0) {
            throw new IllegalArgumentException("set correct values name & age");
        }
    }


    // b.method

    public String checkElgibility() {
        System.out.println("ChekingVotingEligbility: checkElgibility()");

        if (age<18)
            return "Mr./Mrs."+name+"you are not eligible for voting --> verifiedOn :"+verifiedOn;
         else
            return "Mr./Mrs."+name+"you are eligible for voting --> verifiedOn :"+verifiedOn;
    }

    // @PreDestroy // destroy life cycle method
    public void myDestroy() {
        System.out.println("ChekingVotingEligbility: mydestroy()");
        // nullification of the bean properties
        name = null;
        age = null;
        verifiedOn = null;
        id = null;

    }

}



























