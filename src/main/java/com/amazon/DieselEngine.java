package com.amazon;


import org.springframework.stereotype.Component;

@Component("dEngine")
public class DieselEngine implements IEngine{

    @Override
    public void stopEngine() {
        System.out.println("DieselEngine: StopEngine");
    }

    @Override
    public void startEngine() {
        System.out.println("DieselEngine: StartEngine");
    }
}
