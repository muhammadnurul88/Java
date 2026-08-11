//
//
//interface Animal {
//    void makeSound();
//    void eat();
//}
//
//
//class Dog implements Animal {
//
//    public void makeSound() {
//        System.out.println("Bark");
//    }
//
//
//    public void eat() {
//        System.out.println("Dog is eating");
//    }
//}
//
//class Cat implements Animal {
//
//    public void makeSound() {
//        System.out.println("Meow");
//    }
//
//
//    public void eat() {
//        System.out.println("Cat is eating");
//    }
//}
//
//public class InheritanceDemo {
//
//        public static void main(String[] args) {
//            Animal a1 = new Dog();
//            Animal a2 = new Cat();
//
//            a1.makeSound();
//            a1.eat();
//
////            a2.makeSound();
////            a2.eat();
//
//        }
//    }
//
//




//Interface Naming conflicts


//interface Left {
//   public void m1();
//}
//
//interface Right {
//   public void m1();
//}
//
//class InheritanceDemo implements Left, Right {
//    public void m1(){
//        System.out.println("nurul");
//    }
//    public static void main(String[] args) {
//        InheritanceDemo i = new InheritanceDemo();
//       i.m1();
//    }
//}


//interface Left {
//   int x = 999;
//}
//
//interface Right {
//    int x = 888;
//}
//
//public class InheritanceDemo implements Left, Right {
//
//    public static void main(String[] args) {
//       System.out.println(Left.x);
//        System.out.println(Right.x);
//    }
//}



// Adaptor class

interface VehicleListener {
    void start();
    void stop();
    void accelerate();
    void brake();
}

abstract class VehicleAdapter implements VehicleListener {

    public void Start() {}

    public void stop() {}

    public void accelerate() {}

    public void brake() {}
}


class MyVehicleListener extends VehicleAdapter {


    public  void start() {
        System.out.println("Vehicle Started");
    }
}


public class InheritanceDemo {
    public static void main(String[] args) {

        MyVehicleListener obj = new MyVehicleListener();

        obj.start();
    }
}




















