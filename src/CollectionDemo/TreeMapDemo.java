package CollectionDemo;

import java.util.Comparator;
import java.util.TreeMap;

//public class TreeMapDemo {
//    public static void main(String[] args) {
//        TreeMap m = new TreeMap<>();
//        m.put(100, "zzz");
//        m.put(101, "yyy");
//        m.put(103, "xxx");
//        //m.put("FFF", "zzz");
//        //m.put(null, "zzz");
//        System.out.println(m);
//    }
//}



public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap m = new TreeMap<>(new MyComparatorr());
        m.put("zzz", 10);
        m.put("yyy", 20);
        m.put("xxx", 30);
        m.put("xxx", 40);
        //m.put("FFF", "zzz");
        //m.put(null, "zzz");
        System.out.println(m);
    }
}

class MyComparatorr implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String s1 = obj1.toString();
        String s2 = (String)obj2;
        return s1.compareTo(s2);
    }
}