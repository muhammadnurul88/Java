package in.MessageGeneratorDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component("wmg")
public class WishMessageGenerator {
    //@Autowired  // for field injection
    private LocalTime lt;
    //@Autowired // for field injection
    private LocalDate ld;


    public WishMessageGenerator(LocalTime lt, LocalDate ld) {
        this.lt = lt;
        this.ld = ld;
    }
// b.method

    public String generateWishMessage(String user) {
        System.out.println("WishMessageGenerator:generateWishMessage:"+lt+".."+ld);
        // get current hour of the day
        int hour = lt.getHour(); // 24 hour format
        if (hour < 12)
            return "Good Morning:"+ user;
        else if (hour < 16)
            return "Good AfterNoon:"+ user;
        else if (hour < 20)
            return "Good Evening:"+ user;
        else
            return "Good Night:"+ user;
    }
}
