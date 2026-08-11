
// wrapper class contains 2 constructor
//public class WrapperClass {
//    public static void main(String[] args) {
//        Integer I1 =  10;
//        Integer I2 =  Integer.valueOf("10");
//
//        Double D1  = 10.2;
//        Double D2  = Double.valueOf("10.2");
//
//        Float F1 = 10.5f;
//        Float F2 = Float.valueOf("10.5f");
//
//        Character ch  = 'a';
//
//        Boolean B1 = true;
//        Boolean B2 = Boolean.valueOf("true");
//        Boolean B3 = Boolean.valueOf("True");
//        Boolean B4 = Boolean.valueOf("false");
//        Boolean B5 = Boolean.valueOf("yes");
//        Boolean B6 = Boolean.valueOf("no");
//
//
//        System.out.println(I1);
//        System.out.println(I2);
//        System.out.println(D1);
//        System.out.println(D2);
//        System.out.println(ch);
//        System.out.println(F1);
//        System.out.println(F2);
//        System.out.println(B1);
//        System.out.println(B2);
//        System.out.println(B3);
//        System.out.println(B4);
//        System.out.println(B5);
//        System.out.println(B6);
//        System.out.println(B5.equals(B6));
//    }
//}


import com.sun.jdi.InvalidTypeException;

// Explicit conversion method


//public class WrapperClass {
//    public static void main(String[] args) {
//        Integer I = 129;
//
//        Character c = 'a';
//        char ch = c.charValue();
//
//        int i = Integer.parseInt("111",2);
//        Integer in = 10;
//        String s = in.toString();
//
//        String bi = Integer.toBinaryString(10);
//        String oc = Integer.toOctalString(10);
//        String hx = Integer.toHexString(10);
//
//        System.out.println(I.byteValue());
//        System.out.println(I.shortValue());
//        System.out.println(I.intValue());
//        System.out.println(I.floatValue());
//        System.out.println(I.doubleValue());
//        System.out.println(I.longValue());
//        System.out.println(c);
//        System.out.println(ch);
//        System.out.println(i);
//        System.out.println(s);
//        System.out.println(bi);
//        System.out.println(oc);
//        System.out.println(hx);
//   }
// }


// Autoboxing & Autounboxing


//public class WrapperClass {
//    public static void main(String[] args) {
//        Integer I = 10;
//        int i = I;
//        // int i = I.intvalue();  // After compilation the avobe line become like this
//
//        System.out.println(i);
//    }
//}


//public class WrapperClass {
//    static Integer I = 10;
//    public static void main(String[] args) {
//        int i = I;
//        m1(i);
//    }
//    public static void m1(Integer k ){
//        int m = k;
//        System.out.println(m);
//    }
//
//}


//public class WrapperClass {
//    static Integer I = 0;
//    public static void main(String[] args) {
//        int i = I;
//
//        System.out.println(i);
//    }
//
//}


// on null reference if we are performing autounboxing or autoboxing we will get RE : NPE

//public class WrapperClass {
//    static Integer I ;
//    public static void main(String[] args)  {
//
//            int i = I;
//
//
//
//        System.out.println(i);
//    }
//
//}



// Overloading concept with respect to autoboxing , widening & var-arg method

// autoboxing vs widening
//public class WrapperClass {
//    public static void m1(Integer I){
//        System.out.println("Autoboxing");
//    }
//    public static void m1(Long l){
//        System.out.println("Widening");
//    }
//
//    public static void main(String[] args)  {
//          int x = 10;
//        m1(x);
//    }
//}


// widening vs var-arg method

//public class WrapperClass {
//    public static void m1(int... i){
//        System.out.println("var-arg");
//    }
//    public static void m1(Long l){
//        System.out.println("Widening");
//    }
//
//    public static void main(String[] args)  {
//        int x = 10;
//        m1(x);
//    }
//}


// Autoboxing vs var-arg method

//public class WrapperClass {
//    public static void m1(int... i){
//        System.out.println("var-arg");
//    }
//    public static void m1(Integer i){
//        System.out.println("Autoboxing");
//    }
//
//    public static void main(String[] args)  {
//        int x = 10;
//        m1(x);
//
//    }
//}



// widening followed by Autoboxing not allowed

//public class WrapperClass {
//    public static void m1(Long l){
//        System.out.println("long");
//    }
//    public static void main(String[] args)  {
//        int x = 10;
//        m1(x);
//
//    }
//}



// Autoboxing followed by widening allowed

public class WrapperClass {
    public static void m1(Object o){
        System.out.println("Object version");
    }
    public static void main(String[] args)  {
        int x = 10;
        m1(x);

    }
}


































































