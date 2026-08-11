package CollectionDemo;

import java.util.Comparator;
import java.util.PriorityQueue;

//public class QueueDemo {
//    public static void main(String[] args) {
//        PriorityQueue q = new PriorityQueue<>();
//        System.out.println(q.peek());
//        //System.out.println(q.element());
//        for (int i = 0; i <= 10; i++) {
//            q.offer(i);
//        }
//        System.out.println(q);
//        System.out.println(q.poll());
//        System.out.println(q);
//    }
//}



// demo program for customized priority


public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue<>(new MyCommparator());

        q.offer("A");
        q.offer("Z");
        q.offer("L");
        q.offer("B");
        System.out.println(q);
    }
}


class MyCommparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String s1 = (String)obj1;
        String s2 = (String)obj2;
        return s2.compareTo(s1);
    }
}









































































