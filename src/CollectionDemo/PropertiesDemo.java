package CollectionDemo;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;

//public class PropertiesDemo {
//
//        public static void main(String[] args) throws Exception
//        {
//            Properties p = new Properties();
//
//            FileInputStream fis = new FileInputStream("abc.properties");
//            p.load(fis);
//            System.out.println(p);
//
//            String s = p.getProperty("venki");
//            System.out.println(s);
//            p.setProperty("nag", "8888");
//
//            FileOutputStream fos = new FileOutputStream("abc.properties");
//            p.store(fos, "update by durga for scjp");
//
//        }
//}



public class PropertiesDemo {
    public static void main (String[] args) throws Exception
    {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("db.properties");
        p.load(fis);
        String url = p.getProperty("url");
        String user = p.getProperty("user");
        String pwd = p.getProperty("pwd");

        Connection con = DriverManager.getConnection(url,user,pwd);
        ;;;;;;;;;;;;;;;;
    }
}







































































