//
//abstract class Vehicle {
//    abstract public int getNoOfWheels();
//}
//
//class Bus extends Vehicle {
//    @Override
//    public int getNoOfWheels() {
//        return 8;
//    }
//}
//
//class Car extends Vehicle {
//    @Override
//    public int getNoOfWheels() {
//        return 4;
//    }
//}
//
//public class AbstractDemo {
//    public static void main(String[] args) {
//        Bus b = new Bus();
//        System.out.println(b.getNoOfWheels());
//    }
//}
//



//
//  class ProtectedDemo {
//    protected String m1(){
//        return ("The Protected method");
//    }
//}
//
//class AbstractDemo extends ProtectedDemo {
//    public static void main(String[] args) {
//       ProtectedDemo p = new ProtectedDemo();
//        System.out.println(p.m1());
//
//        AbstractDemo A = new AbstractDemo();
//        System.out.println(A.m1());
//
//        ProtectedDemo c = new AbstractDemo();
//        System.out.println(c.m1());
//    }
//}

// Static Modifier

//public class AbstractDemo {
//    static  int x = 10;
//    int y = 20;
//    public static void main(String[] args) {
//        AbstractDemo a1 = new AbstractDemo();
//        a1.x = 999;
//        a1.y = 888;
//
//        AbstractDemo a2 = new AbstractDemo();
//        System.out.println(a2.x);
//        System.out.println(a2.y);
//    }
//}



// Over Loaded Method

//public class AbstractDemo {
//    public static void main(String[] args) {
//        System.out.println("String[] args");
//    }
//    public static void main(int[] args) {
//        System.out.println("int[] args");
//    }
//}


// Method Hiding not overriding

//class X {
//    public static void main(String[] args) {
//        System.out.println("main method");
//    }
//}
//class Y extends x {
//
//    public static void main(String[] args) {
//        System.out.println("Child method");
//    }
//
//}




// Abstract class without costructor


abstract class Person {
    String name;
    int age;
    //100 properties
}

class Student extends Person {
    int rollno;

    Student(String name, int age, int rollno) { //100 properties
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        //100 properties
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollno);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {    //100 properties
        this.name = name;
        this.age = age;
        this.subject = subject;
        //100 properties
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("subject: " + subject);
    }
}

public class AbstractDemo {
    public static void main(String[] args) {

        Student s = new Student("Nuru", 25, 1);
        Teacher t = new Teacher("Rahim", 40, "Java");
       s.display();
       System.out.println();


       t.display();
    }
}


// Abstract class with costructor


//abstract class Person {
//    String name;
//    int age;
//
//    Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//}
//
//class Student extends Person {
//    int rollNo;
//
//    Student(String name, int age, int rollNo) {
//        super(name, age);
//        this.rollNo = rollNo;
//    }
//
//    void display() {
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Roll No: " + rollNo);
//    }
//}
//
//class Teacher extends Person {
//    String subject;
//
//    Teacher(String name, int age, String subject) {
//        super(name, age);
//        this.subject = subject;
//    }
//
//    void display() {
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Subject: " + subject);
//    }
//}
//
//public class AbstractDemo {
//    public static void main(String[] args) {
//
//        Student s = new Student("Nurul", 25, 101);
//        Teacher t = new Teacher("Rahim", 40, "Java");
//
//        s.display();
//        System.out.println();
//
//        t.display();
//    }
//}






