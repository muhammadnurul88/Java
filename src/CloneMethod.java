//public class CloneMethod implements Cloneable {
//    int i = 10;
//    int j = 20;
//
// public static void main(String[] args) throws CloneNotSupportedException {
//     CloneMethod e1 = new CloneMethod();
//     CloneMethod e2 = (CloneMethod)e1.clone();
//
//     e2. i = 888;
//     e2. j = 999;
//     System.out.println(e1.i+"..."+e1.j);
//     System.out.println(e2.i+"..."+e2.j);
// }
//}


// Shallow cloning

//class Cats {
//    int j;
//
//    Cats(int j) {
//        this.j = j;
//    }
//}
//
//class Dogs implements Cloneable {
//    Cats c;
//    int i;
//
//    // FIXED: Constructor now accepts both Cats and int
//    Dogs(Cats c, int i) {
//        this.c = c;
//        this.i = i;
//    }
//
//    // FIXED: Moved the clone() method inside the Dogs class
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//}
//
//public class CloneMethod {
//    public static void main(String[] args) throws CloneNotSupportedException {
//        Cats c = new Cats(2);
//        Dogs d1 = new Dogs(c, 10);
//
//        // Performing the clone
//        Dogs d2 = (Dogs) d1.clone();
//
//        System.out.println("--- Before Modification ---");
//        System.out.println("d1.i: " + d1.i + ", d1.c.j: " + d1.c.j);
//        System.out.println("d2.i: " + d2.i + ", d2.c.j: " + d2.c.j);
//
//        // Modifying the cloned object's primitive and reference types
//        d2.i = 20;
//        d2.c.j = 99; // This changes the Cats object
//
//        System.out.println("\n--- After Modification ---");
//        // i changes independently because it's a primitive type
//        System.out.println("d1.i: " + d1.i + " (Original primitive stays the same)");
//        System.out.println("d2.i: " + d2.i + " (Cloned primitive changed)");
//
//        // j changes for BOTH because it's a shallow copy of the reference
//        System.out.println("d1.c.j: " + d1.c.j + " (Original object CHANGED!)");
//        System.out.println("d2.c.j: " + d2.c.j + " (Cloned object changed)");
//    }
//}



// Deep cloning

class Cats {
    int j;

    Cats(int j) {
        this.j = j;
    }
}

class Dogs implements Cloneable {
    Cats c;
    int i;

    // FIXED: Constructor now accepts both Cats and int
    Dogs(Cats c, int i) {
        this.c = c;
        this.i = i;
    }

    // FIXED: Moved the clone() method inside the Dogs class
    @Override
    public Object clone() throws CloneNotSupportedException {
        Cats c1 = new Cats(c.j);
        Dogs d = new Dogs(c1, i);
        return d;
    }
}


public class CloneMethod {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cats c = new Cats(20);
        Dogs d1 = new Dogs(c,10);
        System.out.println(d1+"..."+d1.c.j);

        Dogs d2 = (Dogs)d1.clone();
        d2.c.j = 888;
        d2.c.j = 999;
        System.out.println(d2.i+".."+d2.c.j);
    }
}










































