package com.nt.ston;

import java.lang.reflect.Constructor;

public class ReflectionAPITest {

    public static void main(String[] args) throws Exception {
        // load class
        Class clazz = Class.forName("com.nt.ston.Printer");
        // get class constructors of the loaded classes
        Constructor cons[] = clazz.getDeclaredConstructors();

        // get access to private constructor
        cons[0].setAccessible(true);

        // create objects

        Object obj1 = cons[0].newInstance();
        Object obj2 = cons[0].newInstance();

        System.out.println(obj1.getClass()+" "+obj2.getClass());
        System.out.println(obj1.hashCode()+" "+obj2.hashCode());

    }
}
