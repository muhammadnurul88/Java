package StrategyDPCorejavaComs;

import java.lang.reflect.Field;

public class FlipkartFactory {

    // static factory method creating and returning Flipkart class obj

    public static Flipkart getInstance(String courierType){
        // create dependent class obj
        ICourier courier = null;
        if (courierType.equalsIgnoreCase("dtdc"))
            courier = new DTDC();
        else if (courierType.equalsIgnoreCase("bluedart"))
            courier = new BlueDart();
        else
            throw new IllegalArgumentException("invalid courier type");
        // create terget class obj
        Flipkart fpkt = new Flipkart();
        // assign dependent class obj to target class obj
        fpkt.setCourier(courier);
        return fpkt;
    }
}
