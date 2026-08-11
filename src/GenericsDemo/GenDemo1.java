package GenericsDemo;


//class Gen<T> {
//    T ob;
//    Gen(T ob){
//        this.ob = ob;
//    }
//    public void show() {
//        System.out.println("The types of ob:" + ob.getClass().getName());
//    }
//    public T getOb () {
//        return ob;
//    }
//}
//
//public class GenDemo1 {
//    public static void main(String[] args) {
//        Gen<String> g1 = new Gen<String>("durga");
//        g1.show();
//        System.out.println(g1.getOb());
//
//        Gen<Integer> g2 = new Gen<Integer>(10);
//        g2.show();
//        System.out.println(g2.getOb());
//
//        Gen<Double> g3 = new Gen<Double>(10.5);
//        g2.show();
//        System.out.println(g3.getOb());
//    }
//}



// generic area & non-generic area


import java.util.ArrayList;

public class GenDemo1 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList<>();
        l.add("durga");
        l.add("Ravi");
        //l.add(10);
        //l.add(10.5);
        m1(l);
        System.out.println(l);
    }
    public static void m1(ArrayList l) {
        l.add(10);
        l.add(10.5);
        l.add(true);
    }
}




































































