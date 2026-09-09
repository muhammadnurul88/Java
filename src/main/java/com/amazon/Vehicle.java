package com.amazon;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
    @Autowired
    @Qualifier("motor")
    private IEngine engine;


    public void journey(String startPlace, String endPlace){

        engine.startEngine();
        System.out.println("Journy started at :"+ startPlace);

        System.out.println("Journy is going on");

        engine.stopEngine();
        System.out.println("Journy End at :"+ endPlace);
    }
}
