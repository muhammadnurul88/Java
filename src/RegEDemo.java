import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.regex.*;

//public class RegEDemo {
//      public static void main(String[] args) {
//          int count = 0;
//           Pattern p = Pattern.compile("ab");
//           Matcher m = p.matcher("abbabbba");
//           while (m.find()) {
//               count ++;
//               System.out.println(m.start()+"--"+m.end()+"--"+m.group());
//           }
//           System.out.println("The total count of occuerances is" + count);
//      }
//}




//public class RegEDemo {
//    public static void main(String[] args) {
//
//        int count = 0;
//
//        Pattern p = Pattern.compile("^ab");
//        Matcher m = p.matcher("3FabDF");
//        while (m.find()) {
//            count ++;
//            System.out.println(m.start()+"--"+m.end()+"--"+m.group());
//        }
//        System.out.println("The total count of occuerances is" + count);
//    }
//}

// split method

//public class RegEDemo {
//    public static void main(String[] args) {
//
//        Pattern p = Pattern.compile("\\s");
//        String[] s = p.split("durga software solution");
//        for (String s1 : s){
//            System.out.println(s1);
//        }
//    }
//}


//public class RegEDemo {
//    public static void main(String[] args) {
//
//        Pattern p = Pattern.compile("[.]");
//        String[] s = p.split("www.software.com");
//        for (String s1 : s){
//            System.out.println(s1);
//        }
//    }
//}


// StringTockenizer

//public class RegEDemo {
//    public static void main(String[] args) {
//        StringTokenizer st = new StringTokenizer("Durga Software Solution");
//        while (st.hasMoreTokens()) {
//            System.out.println(st.nextToken());
//        }
//    }
//}

// specify by delimeter
//
//public class RegEDemo {
//    public static void main(String[] args) {
//        StringTokenizer st = new StringTokenizer("19-09-26", "-");
//        while (st.hasMoreTokens()) {
//            System.out.println(st.nextToken());
//        }
//    }
//}


// writing a program to check mobile number


//public class RegEDemo {
//    public static void main(String[] args) {
//
//        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{10}");
//        Matcher m = p.matcher(args[0]);
//        if (m.find() && m.group().equals(args[0])) {
//            System.out.println("valid mobile number");
//        } else {
//            System.out.println("invalid mobile number");
//        }
//    }
//}


// mobile number mixed with normal text data, mobile extractor

//public class RegEDemo {
//    public static void main(String[] args) throws Exception {
//        PrintWriter r = new PrintWriter("output.txt");
//        Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
//        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
//        String line = br.readLine();
//        while (line !=null) {
//            Matcher m = p.matcher(line);
//            while (m.find()) {
//                System.out.println(m.group());
//            }
//            line = br.readLine();
//        }
//        r.flush();
//        br.close();
//        r.close();

       /* try (
                BufferedReader br = new BufferedReader(new FileReader("input.txt"));
                PrintWriter out = new PrintWriter("output.txt")
        ) {
            Pattern p = Pattern.compile("(0|91)?[6-9]\\d{9}");

            String line;
            while ((line = br.readLine()) != null) {
                Matcher m = p.matcher(line);
                while (m.find()) {
                    out.println(m.group());
                }
            }
        }
    }
}
*/


public class RegEDemo {
    public static void main(String[] args) {
        int count = 0;
        Pattern p = Pattern.compile("[a-zA-Z0-9_$]+[.]txt");
        File f = new File("d:\\react-demo");
        String[] s = f.list();
        for (String s1 : s ) {
            Matcher m = p.matcher(s1);
            if (m.find() && m.group().equals(s1)) {
                count ++;
                System.out.println(s1);
            }
        }
        System.out.println(count);
    }
}




























































