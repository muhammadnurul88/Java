
// Overloaded Constructor

public class ConstrucDemo {

    ConstrucDemo() {
        System.out.println("no-arg constructor");
    }

    ConstrucDemo(int i) {
        this();
        System.out.println("int-arg constructor");
    }

    ConstrucDemo(double d) {
        this(10);
        System.out.println("double-arg constructor");
    }

    public static void main(String[] args) {

        ConstrucDemo c1 = new ConstrucDemo();
        System.out.println();

        ConstrucDemo c2 = new ConstrucDemo(10);
        System.out.println();

        ConstrucDemo c3 = new ConstrucDemo(10.5);
        System.out.println();

        ConstrucDemo c4 = new ConstrucDemo(10L);
    }
}

