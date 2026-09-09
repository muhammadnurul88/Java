package com.amazon;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements IEngine{

    @Override
    public void startEngine() {
        System.out.println("PetrolEngine: StartEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("PetrolEngine: StopEngine");
    }
}
