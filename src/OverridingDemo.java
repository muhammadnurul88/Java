//
//class P {
//    public void mroperty(){
//        System.out.println("Cash + Gold + Lnd");
//    }
//
//    public void marry(){
//        System.out.println("Subha Lxmi");
//    }
//}
//
//class C1 extends P {
//    public void marry(){
//        System.out.println("Isha/tara");
//    }
//}
//
//
//
//public class OverridingDemo {
//    public static void main(String[] args) {
//        C1 c = new C1();
//        c.marry();
//    }
//}






// Parent Class
class Animal {
    void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}

// Child Class extending the Parent
class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("The Cat barking Meo");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {

        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();
    }
}














































