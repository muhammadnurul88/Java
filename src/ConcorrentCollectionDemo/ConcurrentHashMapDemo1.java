package ConcorrentCollectionDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;



public class ConcurrentHashMapDemo1 extends Thread {

    static ConcurrentHashMap m = new ConcurrentHashMap();

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        System.out.println("Child Thread updating map");
        m.put(103, "C");
    }

    public static void main(String[] args) throws Exception
    {
        m.put(101, "A");
        m.put(102, "B");
        ConcurrentHashMapDemo1 t = new ConcurrentHashMapDemo1();
        t.start();
        Set s1 = m.keySet();
        Iterator itr = s1.iterator();
        while (itr.hasNext()) {
            Integer I1 = (Integer)itr.next();
            System.out.println("Main Thread Iterating MAp & Current Entry is :" + m.get(I1));
            Thread.sleep(3000);
        }
        System.out.println(m);
    }
}


