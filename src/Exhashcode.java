

//public class Exhashcode {
//    int i;
//    Exhashcode(int i) {
//        this.i = i;
//    }
//    public static void main(String[] args) {
//        Exhashcode e1 = new Exhashcode(100);
//        Exhashcode e2 = new Exhashcode(1000);
//        System.out.println(e1);
//        System.out.println(e2);
//    }
//}



//public class Exhashcode {
//    int i;
//    Exhashcode(int i){
//        this.i = i;
//    }
//    public int hashCode() {
//        return i;
//    }
//    public static void main(String[] args) {
//        Exhashcode e1 = new Exhashcode(10);
//        Exhashcode e2 = new Exhashcode(100);
//        System.out.println(e1);
//        System.out.println(e2);
//    }
//}



// Storing hash code by override toString method

public class Exhashcode {
    int i;
    Exhashcode(int i){
        this.i = i;
    }
    public String toString(){
        return i + "";
    }
    public int hashCode() {
        return i;
    }
    public static void main(String[] args) {
        Exhashcode e1 = new Exhashcode(10);
        Exhashcode e2 = new Exhashcode(100);
        System.out.println(e1);
        System.out.println(e2);
    }
}








































