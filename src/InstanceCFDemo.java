//public class InstanceCFDemo {
//    int x = 10;
//    {
//        m1();
//     System.out.println("First instance block");
//    }
//    InstanceCFDemo() {
//        System.out.println("Cunstructor");
//    }
//    public static void main(String[] args) {
//        InstanceCFDemo i = new InstanceCFDemo();
//        System.out.println("main method");
//    }
//    public void m1() {
//        System.out.println(j);
//    }
//    {
//        System.out.println("second instance block");
//    }
//    int j = 20;
//}


//public class InstanceCFDemo {
//    {
//        System.out.println("FIB");
//    }
//    static {
//        System.out.println("FSB");
//    }
//    InstanceCFDemo() {
//        System.out.println("Constructor");
//    }
//    public static void main(String[] args) {
//        InstanceCFDemo i1 = new InstanceCFDemo();
//        System.out.println("main");
//        InstanceCFDemo i2 = new InstanceCFDemo();
//    }
//    static {
//        System.out.println("SSB");
//    }
//    {
//        System.out.println("SIB");
//    }
//}




public class InstanceCFDemo {
    private static String m1(String msg) {
        System.out.println(msg);
        return msg;
    }
    public InstanceCFDemo() {
        m = m1("1");
    }
    {
        m = m1("2");
    }
    String m = m1("3");
    public static void main(String[] args) {
       Object o = new InstanceCFDemo();
    }
}




























