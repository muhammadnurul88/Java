package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component("sf")
public class SeasonFinder {

    @Autowired
    private LocalDate ldt;

    //b.method

    public String findSeason(){
        // get Current month
        int month = ldt.getMonthValue();
        //Show Season name
        if (month>=3 && month <=6)
            return "Summer season";
        else if (month>=7 && month <=10)
            return "Rainy Season";
        else
            return "Winter Season";
    }

}
