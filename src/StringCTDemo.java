//public class StringCTDemo {
//    String a = "Nurul";
//    int b = 10, c = 20, d = 30;
//    StringCTDemo() {
//        String x = a + b + c;
//    }
//    public static  void main(String[] args) {
//        StringCTDemo s = new StringCTDemo();
//        System.out.println(s);
//    }
//}


public class StringCTDemo {
    String a = "Nurul";
    int b = 10, c = 20;
    String x;

//    StringCTDemo() {
//        x = a + b + c;
//    }

    StringCTDemo() {
        x = b + c + a;
    }

    public String toString() {
        return x;
    }

    public static void main(String[] args) {
        StringCTDemo s = new StringCTDemo();
        System.out.println(s);
    }
}