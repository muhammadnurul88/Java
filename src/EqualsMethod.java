//public class EqualsMethod {
//    public static void main(String[] args) {
//       String s1 = new String("durga");
//       String s2 = new String("durga");
//
//       StringBuffer sb1 = new StringBuffer("durga");
//       StringBuffer sb2 = new StringBuffer("durga");
//
//       System.out.println(s1==s2);
//       System.out.println(s1.equals(s2));
//       System.out.println(sb1==sb2);
//       System.out.println(sb1.equals(s2));
//       //System.out.println(s1==sb1);
//        System.out.println(s1.equals(sb1));
//    }
//}

// in String class .equals method override for content comparision

//public class EqualsMethod {
//    public static void main(String[] args) {
//        String s1 = new String("durga");
//        String s2 = new String("durga");
//
//
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//    }
//}


// But in StringBuffer class we can't override .equals method

//public class EqualsMethod {
//    public static void main(String[] args) {
//        StringBuffer sb1 = new StringBuffer("durga");
//        StringBuffer sb2 = new StringBuffer("durga");
//
//
//        System.out.println(sb1.equals(sb2));
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//    }
//}



// .equals() method with overriding hashCode() method


public class EqualsMethod {
    String name;
    int age;
    EqualsMethod(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public boolean equals(Object obj) {
        if (obj instanceof EqualsMethod) {
            EqualsMethod e = (EqualsMethod)obj;
        if (name.equals(e.name) && age==e.age){
            return true;
        }else {
            return false;
        }
      }
        return false;
    }
    public int hashCode() {
        return name.hashCode()+age;
    }
    public static void main(String[] args) {
        EqualsMethod e1 = new EqualsMethod("Shiva", 30);
        EqualsMethod e2 = new EqualsMethod("Shiva", 30);
        System.out.println(e1 +"...."+e2);

    }
}
































