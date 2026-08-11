package CollectionDemo;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.TreeSet;

//class MyComparator implements Comparator {
//    public int compare(Object obj1, Object obj2) {
//        Integer I1 = (Integer)obj1;
//        Integer I2 = (Integer)obj2;
//        if (I1 < I2) {
//            return 1;
//        }else {
//            return -1;
//        }
//    }
//}
//
//public class ComparatorIfDemo {
//    public static void main(String[] args) {
//        TreeSet t = new TreeSet<>(new MyComparator());
//
//        t.add(10);
//        t.add(0);
//        t.add(15);
//        t.add(5);
//        t.add(20);
//        t.add(20);
//        System.out.println(t);
//    }
//}



//default Natural Sorting Order or Ascending order


//class MyComparator implements Comparator {
//    public int compare(Object obj1, Object obj2) {
//        Integer I1 = (Integer)obj1;
//        Integer I2 = (Integer)obj2;
//       return I1.compareTo(I2);
//    }
//}
//
//public class ComparatorIfDemo {
//    public static void main(String[] args) {
//        TreeSet t = new TreeSet<>(new MyComparator());
//
//        t.add(10);
//        t.add(0);
//        t.add(15);
//        t.add(5);
//        t.add(20);
//        t.add(20);
//        System.out.println(t);
//    }
//}


// descending Order

//class MyComparator implements Comparator {
//    public int compare(Object obj1, Object obj2) {
//        Integer I1 = (Integer)obj1;
//        Integer I2 = (Integer)obj2;
//        return I2.compareTo(I1);
//    }
//}
//
//public class ComparatorIfDemo {
//    public static void main(String[] args) {
//        TreeSet t = new TreeSet<>(new MyComparator());
//
//        t.add(10);
//        t.add(0);
//        t.add(15);
//        t.add(5);
//        t.add(20);
//        t.add(20);
//        System.out.println(t);
//    }
//}


//class MyComparator implements Comparator {
//    public int compare(Object obj1, Object obj2) {
//        Integer I1 = (Integer)obj1;
//        Integer I2 = (Integer)obj2;
//        return -I1.compareTo(I2);
//    }
//}
//
//public class ComparatorIfDemo {
//    public static void main(String[] args) {
//        TreeSet t = new TreeSet<>(new MyComparator());
//
//        t.add(10);
//        t.add(0);
//        t.add(15);
//        t.add(5);
//        t.add(20);
//        t.add(20);
//        System.out.println(t);
//    }
//}


// Ascending Order

//class MyComparator implements Comparator {
//    public int compare(Object obj1, Object obj2) {
//        Integer I1 = (Integer)obj1;
//        Integer I2 = (Integer)obj2;
//        return -I2.compareTo(I1);
//    }
//}
//
//public class ComparatorIfDemo {
//    public static void main(String[] args) {
//        TreeSet t = new TreeSet<>(new MyComparator());
//
//        t.add(10);
//        t.add(0);
//        t.add(15);
//        t.add(5);
//        t.add(20);
//        t.add(20);
//        System.out.println(t);
//    }
//}


// this program to insert string object into the treeset where all elements should be inserted according to revers of alphabetical order


//class MyComparator implements Comparator {
//    public int compare(Object obj1, Object obj2) {
//       String s1 = obj1.toString();
//       String s2 = (String)obj2;
//       return s1.compareTo(s2);
//       //return -s1.compareTo(s2);
//    }
//}
//
//public class ComparatorIfDemo {
//    public static void main(String[] args) {
//        TreeSet t = new TreeSet(new MyComparator());
//
//        t.add("Nurul");
//        t.add("Sravari");
//        t.add("Raja");
//        t.add("Durga");
//        t.add("Ganga");
//        System.out.println(t);
//    }
//}


// this program to insert stringBffer object into the treeset where all elements should be inserted according to revers of alphabetical order

//class MyComparator implements Comparator {
//    public int compare(Object obj1, Object obj2) {
//        String s1 = obj1.toString();
//        String s2 = obj2.toString();
//        return s1.compareTo(s2);
//        //return -s1.compareTo(s2);
//    }
//}
//
//public class ComparatorIfDemo {
//    public static void main(String[] args) {
//        TreeSet t = new TreeSet(new MyComparator());
//
//        t.add(new StringBuffer("Nurul"));
//        t.add(new StringBuffer("Sravari"));
//        t.add(new StringBuffer("Raja"));
//        t.add(new StringBuffer("Durga"));
//        t.add(new StringBuffer("Ganga"));
//        System.out.println(t);
//    }
//}


// write a program to insert string & stringBuffer object into treeSet where sorting order is increasing length order

//class MyComparator implements Comparator {
//    public int compare(Object obj1, Object obj2) {
//        String s1 = obj1.toString();
//        String s2 = obj2.toString();
//
//        int l1 = s1.length();
//        int l2 = s2.length();
//
//        if (l1 < l2) {
//            return -1;
//        } else if (l1 > l2) {
//            return 1;
//        }else {
//            return s1.compareTo(s2);
//        }
//
//        //return -s1.compareTo(s2);
//    }
//}
//
//public class ComparatorIfDemo {
//    public static void main(String[] args) {
//        TreeSet t = new TreeSet(new MyComparator());
//        t.add("A");
//        t.add(new StringBuffer("ABC"));
//        t.add(new StringBuffer("AA"));
//        t.add("XX");
//        t.add("ABCD");
//        t.add("A");
//        System.out.println(t);
//    }
//}


// this program returning data as based on eid & name also


class Employee implements Comparable {
    String name;
    int eid;

    Employee(String name, int eid) {
        this.name = name;
        this.eid = eid;
    }

    public String toString() {
        return name +".."+ eid;
    }

    @Override
    public int compareTo(Object obj) {
        int eid1 = this.eid;
        Employee e = (Employee)obj;
        int eid2 = e.eid;
        if (eid1 < eid2) {
            return -1;
        } else if (eid1 > eid2) {
            return 1;
        }
        return 0;
    }
}



public class ComparatorIfDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("nag", 100);
        Employee e2 = new Employee("balaih", 200);
        Employee e3 = new Employee("chiru", 50);
        Employee e4 = new Employee("venki", 150);
        Employee e5 = new Employee("nag", 100);

        TreeSet t = new TreeSet<>();

        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        System.out.println(t);

        TreeSet t1 = new TreeSet(new MyComparator());

        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        System.out.println(t1);
    }
}


class MyComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        return s1.compareTo(s2);
        //return -s1.compareTo(s2);
    }
}































































