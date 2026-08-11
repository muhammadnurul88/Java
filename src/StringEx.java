

// overriding equals method on String Object


//public class StringEx {
//    public static void main(String[] args) {
//        String s1 = new String("nurul");
//        String s2 = new String("nurul");
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//    }
//}


// overriding equals method on StringBuffer Object

//public class StringEx {
//    public static void main(String[] args) {
//        StringBuffer s1 = new StringBuffer("nurul");
//        StringBuffer s2 = new StringBuffer("nurul");
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//    }
//}


// creating object that will store in heap & SCP

//public class StringEx {
//    public static void main(String[] args) {
//        String s1 = new String("nurul");
//        s1.concat("software");
//        String s2 = s1.concat("solution");
//        s1 = s1.concat("soft");
//        System.out.println(s1);
//        System.out.println(s2);
//    }
//}
//


// storing objects in scp & heap

//public class StringEx {
//    public static void main(String[] args) {
//        String s1 = new String("you can't change me!");
//        String s2 = new String("you can't change me!");
//
//        System.out.println(s1==s2);
//        String s3 = ("you can't change me!");
//        System.out.println(s1==s3);
//        String s4 = ("you can't change me!");
//        System.out.println(s3==s4);
//        String s5 = ("you can't change me!");
//        System.out.println(s3==s5);
//        String s6 = "you can't";
//        String s7 = s6 + "change me!";
//        System.out.println(s3==s7);
//        final String s8 = "you can't";
//        String s9 = s8 + "change me!";
//        System.out.println(s3==s9);
//        System.out.println(s6==s8);
//    }
//}



public class StringEx {
    public static void main(String[] args) {
        String s1 = new String("durga");
        String s2 = s1.concat("software");
        String s3 = s2.intern();
        System.out.println(s2==s3);
        String s4 = "durgasoftware";
        System.out.println(s3==s4);
    }
}




















