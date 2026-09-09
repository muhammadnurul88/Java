package com.amazon;

import org.springframework.stereotype.Component;

@Component("cEngine")
public class CngEngine implements IEngine{
    @Override
    public void startEngine() {
        System.out.println("CngEngine: StartEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("CngEngine: StopEngine");
    }
}
