package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//public class CollectionsSortDemo {
//    public static void main(String[] args) {
//        ArrayList l = new ArrayList<>();
//        l.add("Z");
//        l.add("A");
//        l.add("K");
//        l.add("L");
//        //l.add(new Integer(10));
//        //l.add(null);
//        System.out.println("before sorting:"+ l);
//        Collections.sort(l);
//        System.out.println("After sorting:" + l);
//    }
//}




// customized sorting order


public class CollectionsSortDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList<>();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("L");
        //l.add(new Integer(10));
        //l.add(null);
        System.out.println("before sorting:"+ l);
        Collections.sort(l, new MyComparator1());
        System.out.println("After sorting:" + l);
    }
}


class MyComparator1 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return -s1.compareTo(s2);
    }
}







































