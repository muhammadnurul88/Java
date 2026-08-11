import java.io.*;

//class Dogss implements Serializable {
//    int i = 10;
//    int j = 20;
//}
//
//public class SerializationDemo {
//    public static void main(String[] args) throws Exception
//    {
//        Dogss d1 = new Dogss();
//
//        FileOutputStream fos = new FileOutputStream("abc.ser");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(d1);
//
//        FileInputStream fis = new FileInputStream("abc.ser");
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        Dogss d2 = (Dogss)ois.readObject();
//
//        System.out.println(d2.i+".."+d2.j);
//    }
//}

// Object Graphs

//class Dogss implements Serializable {
//   Catss c = new Catss();
//}
//
//class Catss implements Serializable {
//    Ratss r = new Ratss();
//}
//
//class Ratss implements Serializable {
//    int j = 20;
//}
//
//
//
//public class SerializationDemo {
//    public static void main(String[] args) throws Exception
//    {
//        Dogss d1 = new Dogss();
//
//        FileOutputStream fos = new FileOutputStream("abc.ser");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(d1);
//
//        FileInputStream fis = new FileInputStream("abc.ser");
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        Dogss d2 = (Dogss)ois.readObject();
//
//        System.out.println(d2.c.r.j);
//    }
//}



// non-Custom Serialization


//class Account implements Serializable {
//    String username = "nurul";
//    transient String pwd = "sravari";
//}
//
//public class SerializationDemo {
//    public static void main(String[] args) throws Exception
//    {
//        Account a1 = new Account();
//        System.out.println(a1.username+"--"+a1.pwd);
//        FileOutputStream fos = new FileOutputStream("abc.ser");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(a1);
//
//        FileInputStream fis = new FileInputStream("abc.ser");
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        Account a2 = (Account)ois.readObject();
//        System.out.println(a2.username+"--"+a2.pwd);
//    }
//}


// custom Serialization


//class Accounts implements Serializable {
//    String username = "nurul";
//    String pwd = "sravari";
//     private void writeObject(ObjectOutputStream os) throws Exception {
//         os.defaultWriteObject();
//         String epwd = "123"+ pwd;
//         os.writeObject(epwd);
//     }
//     private void readObject(ObjectInputStream is) throws Exception {
//         is.defaultReadObject();
//         String epwd = (String)is.readObject();
//         pwd = epwd.substring(3);
//     }
//}
//
//public class SerializationDemo {
//    public static void main(String[] args) throws Exception {
//        Accounts a1 = new Accounts();
//        System.out.println(a1.username+"--"+a1.pwd);
//        FileOutputStream fos = new FileOutputStream("abc.ser");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(a1);
//
//        FileInputStream fis = new FileInputStream("abc.ser");
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        Accounts a2 = (Accounts)ois.readObject();
//        System.out.println(a2.username+"--"+a2.pwd);
//    }
//}



// custom Serialization

//class Account implements Serializable {
//    String username = "nurul";
//    transient String pwd = "sravari";
//    transient int pin = 1234;
//
//    private void writeObject(ObjectOutputStream os) throws Exception {
//        os.defaultWriteObject();
//        String epwd = "123"+ pwd;
//        int epin = 4444 + pin;
//        os.writeObject(epwd);
//        os.writeInt(epin);
//    }
//    private void readObject(ObjectInputStream is) throws Exception {
//        is.defaultReadObject();
//        String epwd = (String)is.readObject();
//        pwd = epwd.substring(3);
//        int epin = is.readInt();
//        pin = epin-4444;
//    }
//}
//
//public class SerializationDemo {
//    public static void main(String[] args) throws Exception {
//        Account a1 = new Account();
//        System.out.println(a1.username+"-"+a1.pwd+"-"+a1.pin);
//
//        FileOutputStream fos = new FileOutputStream("abc.ser");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(a1);
//
//        FileInputStream fis = new FileInputStream("abc.ser");
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        Account a2 = (Account)ois.readObject();
//        System.out.println(a2.username+"-"+a2.pwd+"-"+a2.pin);
//    }
//}



// Serializble with respect to inheritance


//class Animals implements Serializable {
//    int i = 10;
//}
//
//class Dogg extends Animals {
//    int j = 20;
//}
//
//public class SerializationDemo{
//    public static void main(String[] args) throws Exception {
//        Dogg d1 = new Dogg();
//        System.out.println(d1.i+"--"+d1.j);
//
//        FileOutputStream fos = new FileOutputStream("abc.ser");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(d1);
//
//        FileInputStream fis = new FileInputStream("abc.ser");
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        Dogg d2 = (Dogg)ois.readObject();
//        System.out.println(d2.i+"--"+ d2.j);
//    }
//}




// non-serializble parent class should contain no-arg constructor other wise we will get RE: InvalidClassException



class Animals {
    int i = 10;
    Animals() {
        System.out.println("Animal constructor called");
    }
}

class Dogss extends Animals implements Serializable {
    int j = 20;
    Dogss() {
        System.out.println("Dog constructor called");
    }
}

public class SerializationDemo {
    public static void main(String[] args) throws Exception {
        Dogss d1 = new Dogss();
        d1.i = 888;
        d1.j = 999;


        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dogss d2 = (Dogss)ois.readObject();
        System.out.println(d2.i+"--"+d2.j);

    }
}



















































