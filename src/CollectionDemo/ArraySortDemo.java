package CollectionDemo;


import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

//public class ArraySortDemo {
//    public static void main(String[] args) {
//        int[] a = {10, 5, 20, 11, 6};
//        System.out.println("Primitive array before sorting");
//        for (int a1 : a) {
//            System.out.println(a1);
//        }
//
//        Arrays.sort(a);
//        System.out.println("Primitive array after sorting");
//        for (int a1 : a) {
//            System.out.println(a1);
//        }
//
//        String[] s = {"A", "Z", "B"};
//        System.out.println("Object array before sorting");
//        for (String s1 : s) {
//            System.out.println(s1);
//        }
//
//        Arrays.sort(s);
//        System.out.println("Object array after sorting");
//        for (String s1 : s) {
//            System.out.println(s1);
//        }
//
//        Arrays.sort(s, new MyComparator3());
//        System.out.println("Object array after sorting by Comparator");
//        for (String s1 : s) {
//            System.out.println(s1);
//        }
//    }
//}
//
//
//class MyComparator3 implements Comparator {
//    @Override
//    public int compare(Object o1, Object o2) {
//        String s1 = o1.toString();
//        String s2 = o2.toString();
//        return s2.compareTo(s1);
//    }
//}





//class MyComparator4 implements Comparator {
//    @Override
//    public int compare(Object o1, Object o2) {
//        String s1 = o1.toString();
//        String s2 = o2.toString();
//        return s2.compareTo(s1);
//    }
//}
//
//
//
//public class ArraySortDemo {
//    public static void main(String[] args) {
//        int[] a = {10, 5, 20, 11, 6};
//        Arrays.sort(a);
//        System.out.println(Arrays.binarySearch(a, 6));
//        System.out.println(Arrays.binarySearch(a, 14));
//
//        String[] s = {"A", "Z", "B"};
//        Arrays.sort(s);
//        System.out.println(Arrays.binarySearch(s, "Z"));
//        System.out.println(Arrays.binarySearch(s, "S"));
//
//        Arrays.sort(s, new MyComparator4());
//        System.out.println(Arrays.binarySearch(s, "Z", new MyComparator4()));
//        System.out.println(Arrays.binarySearch(s, "S", new MyComparator4()));
//        System.out.println(Arrays.binarySearch(s, "N"));
//    }
//}




public class ArraySortDemo {
    public static void main(String[] args) {
        String[] s = {"A", "Z", "B"};
        List l = Arrays.asList(s);
        System.out.println(l);
        s[0] = "K";
        System.out.println(l);
        l.set(1, "L");
        for (String s1 : s) {
            System.out.println(s1);
            //l.add("durag");
        }
    }
}







































