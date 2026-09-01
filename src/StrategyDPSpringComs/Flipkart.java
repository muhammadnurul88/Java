package StrategyDPSpringComs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Random;
@Component
public class Flipkart {
    @Autowired
    private ICourier courier;


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
