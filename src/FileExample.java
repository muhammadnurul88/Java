import java.io.*;

//this line won't create physical path it will check available or not & then it will represent the name file



//public class FileExample {
//    public static void main(String[] args) throws Exception
//    {
//        File f = new File("javaSetup.txt");
//       System.out.println(f.exists());
//       f.createNewFile();  // this line will
//        System.out.println(f.exists());
//    }
//}


// we can use java file object to represent directory also

//public class FileExample {
//    public static void main(String[] args) throws Exception
//    {
//        File f = new File("javaExample");
//        System.out.println(f.exists());
//        f.mkdir(); // by this line
//        System.out.println(f.exists());
//
//    }
//}


// file class constructor

// To display name of the file & directory present in C Directory

//public class FileExample {
//    public static void main(String[] args) throws Exception
//    {
//        int count = 0;
//        File f = new File("C:/react-demo");
//         String[] s = f.list();
//         for (String s1 : s ) {
//             count ++;
//             System.out.println(s1);
//         }
//       System.out.println("the total count :" + count);
//
//    }
//}


//to display only file name

//public class FileExample {
//    public static void main(String[] args) throws Exception
//    {
//        int count = 0;
//        File f = new File("C:/react-demo");
//        String[] s = f.list();
//        if (s != null) {
//        for (String s1 : s ) {
//            File f1 = new File(f,s1);
//            if (f1.isFile()){
//                count++;
//                System.out.println(s1);
//            }
//
//        }
//    }
//        System.out.println("the total count :" + count);
//
//    }
//}


// To display Directory name


//public class FileExample {
//    public static void main(String[] args) throws Exception
//    {
//       int count = 0;
//       File f = new File("C:/react-demo");
//       String[] s = f.list();
//       if (s != null) {
//           for (String s1 : s ){
//               File f1 = new File(f,s1);
//               if (f1.isDirectory()) {
//                   count++;
//                   System.out.println(s);
//               }
//           }
//       }
//        System.out.println("the total count :" + count);
//    }
//}

//
/// / (Filewriter) to write charechter data into the file
//
//public class FileExample {
//    public static void main(String[] args) throws Exception
//    {
//        FileWriter fw = new FileWriter("abc.txt");
//        fw.write(100);
//        fw.write("urga\nSoftwareSolution");
//        fw.write('\n');
//        char[] ch = {'a','b','c'};
//        fw.write(ch);
//        fw.write('\n');
//        fw.flush();
//        fw.close();
//        System.out.println(fw);
//    }
//}





// (FileReader) to read charechter data from the file

//public class FileExample {
//    public static void main(String[] args) throws Exception
//    {
//        File f = new File("abc.txt");
//        FileReader fw = new FileReader(f);
//        int i = fw.read();
//        while (i != -1){
//            System.out.println((char)i);
//            i = fw.read();
//        }
//
//    }
//}





// (FileReader) to read charechter data from the file

//public class FileExample {
//    public static void main(String[] args) throws Exception
//    {
//        File f = new File("abc.txt");
//        FileReader fw = new FileReader(f);
//        char[] ch = new char[(int)f.length()];
//        fw.read(ch);
//        for (char ch1 : ch) {
//            System.out.println(ch1);
//        }
//        System.out.println("********************");
//        FileReader fw1 = new FileReader("abc.txt");
//        int i = fw1.read();
//        while (i != -1){
//            System.out.println((char)i);
//            i = fw1.read();
//        }
//
//    }
//}


// (FileReader) to read charechter data from the file

//public class FileExample {
//    public static void main(String[] args) throws Exception
//    {
//        File f = new File("abc.txt");
//        FileReader fw = new FileReader(f);
//        char[] ch = new char[(int)f.length()];
//        fw.read(ch);
//        for (char ch1 : ch) {
//            System.out.println(ch1);
//        }
//        System.out.println("********************");
//        FileReader fw1 = new FileReader("abc.txt");
//        int i = fw1.read();
//        while (i != -1){
//            System.out.println((char)i);
//            i = fw1.read();
//        }
//
//    }
//}




// (BufferdWriter) to write charechter data into the file

//public class FileExample {
//    public static void main(String[] args) throws Exception
//    {
//        FileWriter fw = new FileWriter("abc.txt");
//        BufferedWriter bw = new BufferedWriter(fw);
//        bw.write(100);
//        bw.newLine();
//        char[] ch = {'a', 'b', 'c'};
//        bw.write(ch);
//        bw.newLine();
//        bw.write("durga");
//        bw.newLine();
//        bw.write("Software sollution");
//        bw.flush();
//        bw.close();
//    }
//}




// (BufferdReader) to read charechter data from the file

//public class FileExample {
//    public static void main(String[] args) throws Exception
//    {
//        FileReader fr = new FileReader("abc.txt");
//        BufferedReader br = new BufferedReader(fr);
//        String line = br.readLine();
//        while (line != null) {
//            System.out.println(line);
//            line = br.readLine();
//        }
//        br.close();
//    }
//}



// (PrintWriter) to write charechter data into the file

//public class FileExample {
//    public static void main(String[] args) throws Exception
//    {
//        FileWriter fw = new FileWriter("abc.txt");
//        PrintWriter out = new PrintWriter(fw);
//        out.write(100);
//        out.println(100);
//        out.println(true);
//        out.println('c');
//        out.println("durga");
//        out.flush();
//        out.close();
//    }
//}




// (PrintWriter) to write charechter data into the file

//public class FileExample {
//    public static void main(String[] args) throws Exception
//    {
//        FileWriter fw = new FileWriter("delete.txt");
//        PrintWriter out = new PrintWriter(fw);
//        out.write(100);
//        out.println(100);
//        out.println(true);
//        out.println('c');
//        out.println("durga");
//        out.flush();
//        out.close();
//    }
//}




// its merge data from tow file third

//public class FileExample {
//    public static void main(String[] args) throws Exception
//    {
//        PrintWriter pw = new PrintWriter("file3.txt");
//        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
//        String line = br.readLine();
//        while (line != null) {
//            System.out.println(line);
//            line = br.readLine();
//        }
//        br = new BufferedReader(new FileReader("file2.txt"));
//        line = br.readLine();
//        while (line != null) {
//            System.out.println(line);
//            line = br.readLine();
//        }
//        pw.flush();
//        pw.close();
//        br.close();
//    }
//}




// its merge data from tow file third by alternatively

//public class FileExample {
//    public static void main(String[] args) throws Exception
//    {
//        PrintWriter pw = new PrintWriter("file3.txt");
//        BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
//        BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
//        String line1 = br1.readLine();
//        String line2 = br2.readLine();
//        while ((line1 != null) || (line2 != null)) {
//            if (line1 != null) {
//                pw.println(line1);
//                line1 = br1.readLine();
//            }
//            if (line2 != null) {
//                pw.println(line2);
//                line2 = br2.readLine();
//            }
//        }
//        pw.flush();
//        pw.close();
//        br1.close();
//        br2.close();
//    }
//}
//





// This performing file Extraction operation

public class FileExample {
    public static void main(String[] args) throws Exception
    {
       PrintWriter pw = new PrintWriter("output.txt");
       BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));
       String line = br1.readLine();
       while (line != null) {
          boolean available = false;
          BufferedReader br2 = new BufferedReader(new FileReader("output.txt"));
          String target = br2.readLine();
          while (target != null) {
              if (line.equals(target)){
                  available = true;
                  break;
              }
              target = br2.readLine();
          }
          if (available == false) {
              pw.println(line);
              pw.flush();
          }
          line = br1.readLine();
       }
    }
}



























































































































