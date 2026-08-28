package in.PaymentDemo;

import in.PaymentDemo.Payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    // field Injection
    //@Autowired
    private PaymentService p;


      // Constructor Injection
//    @Autowired
//    OrderService(PaymentService p){
//        this.p = p;
//    }

    // Setter Injection
    @Autowired
    public void setP(PaymentService p) {
        this.p = p;
    }

    public void PlaceOrder() {
        p.Pay();

        System.out.println("Place Order");
    }
}
