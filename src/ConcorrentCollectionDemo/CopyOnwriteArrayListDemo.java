package ConcorrentCollectionDemo;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

//public class CopyOnwriteArrayListDemo {
//    public static void main(String[] args) {
//        ArrayList l = new ArrayList<>();
//        l.add("A");
//        l.add("B");
//        CopyOnWriteArrayList l1 = new CopyOnWriteArrayList();
//        l1.addIfAbsent("A");
//        l1.addIfAbsent("C");
//        l1.addAll(l);
//        ArrayList l2 = new ArrayList<>();
//        l2.add("A");
//        l2.add("E");
//        l1.addAllAbsent(l2);
//        System.out.println(l1);
//    }
//}



//public class CopyOnwriteArrayListDemo extends Thread {
//    static CopyOnWriteArrayList l = new CopyOnWriteArrayList<>();
//    public void run() {
//        try {
//            Thread.sleep(2000);
//        }catch (InterruptedException e){}
//        System.out.println("Child thread updating List");
//        l.add("C");
//    }
//
//    public static void main(String[] args) throws Exception
//    {
//        l.add("A");
//        l.add("B");
//        CopyOnwriteArrayListDemo t = new CopyOnwriteArrayListDemo();
//        t.start();
//        Iterator itr = l.iterator();
//        while (itr.hasNext()){
//            String s1 = (String)itr.next();
//            System.out.println("Main Tread Itearating List & Concurrent object is:"+ s1);
//            Thread.sleep(3000);
//        }
//        System.out.println(l);
//    }
//}




//public class CopyOnwriteArrayListDemo {
//    public static void main(String[] args) {
//        CopyOnWriteArrayList l = new CopyOnWriteArrayList<>();
//        l.add("A");
//        l.add("B");
//        l.add("C");
//        l.add("D");
//        System.out.println(l);
//        Iterator itr = l.iterator();
//        while (itr.hasNext()) {
//            String s1 = (String)itr.next();
//            if (s1.equals("D")){
//                itr.remove();
//            }
//        }
//        System.out.println(l);
//    }
//}






public class CopyOnwriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList l = new CopyOnWriteArrayList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        Iterator itr = l.iterator();
        l.add("D");
        while (itr.hasNext()) {
            String s1 = (String)itr.next();
            System.out.println(s1);
        }
    }
}










































































