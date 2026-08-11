
// Accesing class level properties by using getClass mnethod

import java.lang.reflect.Method;

public class Properties {
    public static void main(String[] args) {
        int count = 0;
        Object o = new String("nurul");
        Class c = o.getClass();
        System.out.println("Fully qualified name of the class:"+c.getName());
        Method[] m = c.getDeclaredMethods();
        System.out.println("Methid information");
        for (Method m1 : m) {
            count++;
            System.out.println(m1.getName());
        }
        System.out.println("The number of methods:"+count);
    }
}
