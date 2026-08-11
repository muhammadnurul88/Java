//public class StaticCFDemo {
//    static int x = 10;
//    static {
//        m1();
//        System.out.println("First static block");
//    }
//    public static void main(String[] args) {
//        m1();
//        System.out.println("Main method");
//    }
//    public static void m1() {
//        System.out.println(j);
//    }
//    static {
//        System.out.println("second static block");
//    }
//    static int j = 20;
//
//}

public class StaticCFDemo {
    private static String m1(String msg) {
        System.out.println(msg);
        return msg;
    }
    static String s = m1("1");
    {
        s = m1("2");
    }
     static {
        s = m1("3");
    }
    public static void main(String[] args) {
        Object o = new StaticCFDemo();
    }
}




































