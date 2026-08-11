
// Overloding concept
//    class Calculator {
//
//        int add(int a, int b) {
//            return a + b;
//        }
//
//        int add(int a, int b, int c) {
//            return a + b + c;
//        }
//
//        double add(double a, double b) {
//            return a + b;
//        }
//    }
//
//    public class OverLoadingDemo {
//        public static void main(String[] args) {
//            Calculator c = new Calculator();
//
//            System.out.println(c.add(10, 20));
//           System.out.println(c.add(10, 20, 30));
//            System.out.println(c.add(10.5, 20.5));
//        }
//    }

// var-arg method


//public class  OverLoadingDemo {
//    public void m1(int x){
//        System.out.println("general method");
//    }
//    public void m1(int... x){
//        System.out.println("var-arg method");
//    }
//    public static void main(String[] args) {
//        OverLoadingDemo o = new OverLoadingDemo();
//        o.m1();
//        o.m1(10);
//        o.m1(20,30);
//    }
//}



// OverLoading concept is aplicable for main method


//public class  OverLoadingDemo {
//    public static void main(int[] args) {
//        System.out.println(args[0]);
//    }
//    public static void main(String[] args) {
//        System.out.println("string[]");
//        int[] myIntArray = {32};
//        main(myIntArray);
//    }
//}


// method hiding but not overriding concept is aplicable for main method



public class  OverLoadingDemo {
    public static void main(String[] args) {
        System.out.println("Parent main");
    }
}
    class c extends OverLoadingDemo {
        public static void main(String[] args) {
            System.out.println("child main");

        }
    }
















