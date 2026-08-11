import java.lang.reflect.Method;
import java.util.ArrayList;


// to get Object all methods
//public class Packagelang1 {
//
//    public static void main(String[] args) throws Exception
//    {
//        int count = 0;
//        Class c = Class.forName("java.lang.Object");
//        Method[] m = c.getDeclaredMethods();
//        for(Method m1 : m) {
//            count++;
//            System.out.println(m1.getName());
//        }
//        System.out.println("The number of methods"+ count);
//    }
//}


// Using toString to get requirement level output

//public class Packagelang1 {
//
//    String name;
//    int rollno;
//    Packagelang1(String name, int rollno) {
//        this.name = name;
//        this.rollno = rollno;
//    }
//    public String toString(){
//        return "The name of Student:"+ name +"And Roll no:"+ rollno;
//    }
//    public static void main(String[] args) {
//    Packagelang1 p1 = new Packagelang1("Durga", 101);
//    Packagelang1 p2 = new Packagelang1("Ravi", 102);
//    System.out.println(p1);
//    System.out.println(p2);
//    }
//}


public class Packagelang1 {
    @Override
    public String toString() {
        return "test";
    }
    public static void main(String[] args) {
        String s = new String("durga");
        System.out.println(s);
        Integer i = 10;
        System.out.println(i);
        ArrayList l =new ArrayList();
        l.add("A");
        l.add("B");
        System.out.println(l);
        Packagelang1 p = new Packagelang1();
        System.out.println(p);
    }
}























