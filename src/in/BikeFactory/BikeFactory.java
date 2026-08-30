package in.BikeFactory;

import in.Components.*;

public class BikeFactory {
    // static factory method having factory patterns logics

    public static Bike orderBike(String type) {
        Bike bike=null;
            if (type.equalsIgnoreCase("Standard"))
            bike = new StarndardBike();
        else if (type.equalsIgnoreCase("superBike"))
            bike = new SuperBike();
        else if (type.equalsIgnoreCase("OffRoad"))
            bike = new OffRoadingBike();
        else if (type.equalsIgnoreCase("Electric"))
            bike = new ElectricBike();
        else
            throw new IllegalArgumentException("Bike not available");

        return bike;
    }
}
