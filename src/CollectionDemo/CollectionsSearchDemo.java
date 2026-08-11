package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//public class CollectionsSearchDemo {
//    public static void main(String[] args) {
//        ArrayList l = new ArrayList<>();
//
//        l.add("Z");
//        l.add("A");
//        l.add("M");
//        l.add("K");
//        l.add("a");
//        System.out.println(l);
//        Collections.sort(l);
//        System.out.println(l);
//        System.out.println(Collections.binarySearch(l,"Z"));
//        System.out.println(Collections.binarySearch(l,"j"));
//    }
//}



public class CollectionsSearchDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList<>();

        l.add(15);
        l.add(0);
        l.add(20);
        l.add(10);
        l.add(5);
        System.out.println(l);
        Collections.sort(l, new MyComparator2());
        System.out.println(l);
        System.out.println(Collections.binarySearch(l,10, new MyComparator2()));
        System.out.println(Collections.binarySearch(l,13, new MyComparator2()));
        System.out.println(Collections.binarySearch(l,17));
    }
}



class MyComparator2 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer)o1;
        Integer i2 = (Integer)o2;
        return i2.compareTo(i1);
    }
}































































