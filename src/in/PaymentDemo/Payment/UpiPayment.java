package in.PaymentDemo.Payment;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class UpiPayment implements PaymentService {

    @Override
    public void Pay() {
        System.out.println("Payment via UPI");
    }
}
