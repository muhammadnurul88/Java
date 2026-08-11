package CollectionDemo;

import java.util.HashMap;

public class WeakHashmap {
    public static void main(String[] args) throws Exception {
        HashMap m = new HashMap<>();
        Temp t = new Temp();
        m.put(t, "durga");
        System.out.println(m);
        t = null;
        //System.get();
        System.out.println(m);

    }
}


class Temp {
    public String toString() {
        return "Temp";
    }
    public void finalize() {
        System.out.println("finalize method called");
    }
}
