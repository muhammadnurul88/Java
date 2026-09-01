package StrategyDPCorejavaComs;

public class StrategyDpTest {

    public static void main(String[] args) {
        // get flikart class obj
        Flipkart fpkt = FlipkartFactory.getInstance("bluedart");
        // invoke bussines method
        String msg = fpkt.shopping(new String[]{"Shirt", "trauser", "shoes", "jeans"}, new double[]{3000.0, 4000.0, 5000.0, 4000.0});

        System.out.println(msg);
    }
}
