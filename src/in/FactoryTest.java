package in;

import in.BikeFactory.BikeFactory;
import in.Components.Bike;

public class FactoryTest {
    public static void main(String[] args) {
        Bike bike = BikeFactory.orderBike("Standard");
        bike.drive();
        System.out.println("---");

        Bike bike1 = BikeFactory.orderBike("superBike");
        bike1.drive();
        System.out.println("---");


        Bike bike2 = BikeFactory.orderBike("OffRoad");
        bike2.drive();
        System.out.println("---");


        Bike bike3 = BikeFactory.orderBike("Electric");
        bike3.drive();
        System.out.println("---");


    }
}


