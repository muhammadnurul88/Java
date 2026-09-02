package com.WisMGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Component("wmg")
@Scope("singleton")
public class WishMessageGenerator {
    @Autowired
    @Qualifier("dt")
    private LocalDateTime ltd;

    public WishMessageGenerator() {
        System.out.println("no-param constructoer");
    }

    public String generateWishMessage(String user) {
        System.out.println("WishMessageGenerator:generateWishMessage:"+ltd);
        // get current hour of the day
        int hour = ltd.getHour(); // 24 hour format
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
