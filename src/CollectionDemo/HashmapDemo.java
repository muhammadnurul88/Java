package CollectionDemo;

import java.util.*;

public class HashmapDemo {
    public static void main(String[] args) {
      HashMap m = new HashMap();
      m.put("chiranjivi", 700);
      m.put("balaikh", 800);
      m.put("venkash", 200);
      m.put("nagarujna", 500);

      System.out.println(m);

      System.out.println(m.put("chiranjivi", 10000));
      Set s = m.keySet();
      System.out.println(s);

      Collection c = m.values();
      System.out.println(c);

      Set s1 = m.entrySet();
      System.out.println(s1);


      Iterator itr = s1.iterator();
      while (itr.hasNext()) {
          Map.Entry m1 = (Map.Entry)itr.next();
          System.out.println(m1.getKey()+"--"+m1.getValue());
          if (m1.getKey().equals("nagarujna")){
              m1.setValue(10000);
          }
      }
     System.out.println(m);
    }
}























































































