package CollectionDemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList<>();
        l.add("Nurul");
        l.add("Nag");
        l.add("Chiru");
        l.add("venki");
        System.out.println(l);
        ListIterator ltr = l.listIterator();
        while (ltr.hasNext()){
            String s = (String)ltr.next();
            if (s.equals("Venki")) {
                ltr.remove();
            } else if (s.equals("Nag")) {
                ltr.add("chaitu");
            } else if (s.equals("Chiru")) {
                ltr.set("charan");
            }
            System.out.println(l);
        }

    }
}
