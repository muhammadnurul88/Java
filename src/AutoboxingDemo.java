//public class AutoboxingDemo {
//    static Integer I = 10;
//    public static void main(String[] args) {
//        int i = I;
//        m1(i);
//    }
//    public static void m1(Integer k) {
//        int m = k;
//        System.out.println(m);
//    }
//}



//public class AutoboxingDemo {
//    static Integer I = 10;
//    public static void main(String[] args) {
//        int i = I;
//        System.out.println(i);
//    }
//}


//public class AutoboxingDemo {
//    static Integer I;
//    public static void main(String[] args) {
//        int i = I;
//        System.out.println(i);
//    }
//}

// Overloading with Autoboxing vs widening


//public class AutoboxingDemo {
//    public static void m1(Integer I) {
//        System.out.println("Autoboxing");
//    }
//
//    public static void m1(long I) {
//        System.out.println("widening");
//    }
//    public static void main(String[] args) {
//        int i = 10;
//        m1(i);
//    }
//}


//  Overloading with widening vs var-arg method

//public class AutoboxingDemo {
//    public static void m1(int... x) {
//        System.out.println("var-arg");
//    }
//
//    public static void m1(long l) {
//        System.out.println("widening");
//    }
//    public static void main(String[] args) {
//        int i = 10;
//        m1(i);
//    }
//}




// Autoboxing vs var-arg method


//public class AutoboxingDemo {
//    public static void m1(int... x) {
//        System.out.println("var-arg");
//    }
//
//    public static void m1(Integer I) {
//        System.out.println("widening");
//    }
//    public static void main(String[] args) {
//        int i = 10;
//        m1(i);
//    }
//}



// Widening folloed by Autoboxing

//public class AutoboxingDemo {
//
//    public static void m1(Object o) {
//        System.out.println("Object version");
//    }
//    public static void main(String[] args) {
//        int i = 10;
//        m1(i);
//    }
//}


// Autoboxing followed by widening

//public class AutoboxingDemo {
//
//    public static void m1(Long l) {
//        System.out.println("Object version");
//    }
//    public static void main(String[] args) {
//        int i = 10;
//        m1(i);
//    }
//}









































