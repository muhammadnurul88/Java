public class StaticDemo {
    static int x = 10;
    int y = 20;
    public static void main(String[] args) {
        StaticDemo s1 = new StaticDemo();
        s1.x = 888;
        s1.y = 999;
        StaticDemo s2 = new StaticDemo();
        System.out.println(s2.x+".."+s2.y+".."+ s1.y+".."+ s1.x);
    }
}
