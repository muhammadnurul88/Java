package in.PaymentDemo.Payment;



import org.springframework.stereotype.Component;

@Component
public class CardPayment implements PaymentService {

    @Override
    public void Pay() {
        System.out.println("Payment via Card");
    }
}
