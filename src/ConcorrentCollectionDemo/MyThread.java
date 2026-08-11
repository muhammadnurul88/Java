package ConcorrentCollectionDemo;

import java.util.*;

 public class MyThread extends Thread {
    static ArrayList l = new ArrayList<>();
    public void run() {
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        System.out.println("Child Thread updating list");
        l.add("D");
    }

    public static void main(String[] args) throws Exception
    {
        l.add("A");
        l.add("B");
        l.add("C");
        MyThread t = new MyThread();
        t.start();
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            String s1 = (String)itr.next();
            System.out.println("Main thread iterating list & current object:" + s1);
            Thread.sleep(3000);
        }
        System.out.println(l);
    }
}