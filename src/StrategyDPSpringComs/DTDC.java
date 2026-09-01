package StrategyDPSpringComs;


import org.springframework.stereotype.Component;

@Component
public final class DTDC implements ICourier{

    public DTDC() {
        System.out.println("no-arg constructor-DTDC()");
    }
    @Override
    public String deliver(int oid){
        return "order id" + oid + "order items ready to deliver DTDC Courier Service";
    }
}
