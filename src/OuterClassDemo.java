//public class OuterClassDemo {
//
//    class InnerClass {
//        public void m1() {
//            System.out.println("Inner Class");
//        }
//    }
//        public static void main(String[] args) {
//            new OuterClassDemo().new InnerClass().m1();
//        }
//
//}



//public class OuterClassDemo {
//        int x = 10;
//        static int y = 20;
//        class InnerClass{
//            public void m1() {
//                System.out.println(x);
//                System.out.println(y);
//            }
//        }
//    public static void main(String[] args) {
//            new OuterClassDemo().new InnerClass().m1();
//    }
//}


//  public class OuterClassDemo {
//    int x = 10;
//    class InnerClass{
//        int x = 100;
//        public void m1() {
//            int x = 1000;
//            System.out.println(x);
//            System.out.println(this.x);
//            System.out.println(OuterClassDemo.this.x);
//        }
//    }
//        public static void main(string[] args) {
//            new OuterClassDemo().new InnerClass().m1();
//        }
//  }


















