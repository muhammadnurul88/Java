package StrategyDPCorejavaComs;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
    private ICourier courier;

    // setter method of assignment

    public void setCourier(ICourier courier) {
        System.out.println("Flipkart.setCourier()");
        this.courier = courier;
    }

    //business method
    public String shopping(String items[], double prices[]){
        // clalculate the bill amount
        double BillAmt = 0.0;
        for (double p : prices){
            BillAmt = BillAmt+p;
        }
        // create order id
        int oid = new Random().nextInt(1000);

        // deliver items
        String msg = courier.deliver(oid);

        // send msg
        return Arrays.toString(items)+"are purchased having prices" +Arrays.toString(prices)+"bill amount" + BillAmt + "..."+msg;
    }
}
