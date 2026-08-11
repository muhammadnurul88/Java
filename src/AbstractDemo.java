
abstract class Vehicle {
    abstract public int getNoOfWheels();
}

class Bus extends Vehicle {
    @Override
    public int getNoOfWheels() {
        return 8;
    }
}

class Car extends Vehicle {
    @Override
    public int getNoOfWheels() {
        return 4;
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Bus b = new Bus();
        System.out.println(b.getNoOfWheels());
    }
}