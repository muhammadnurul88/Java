package com.amazon;

import org.springframework.stereotype.Component;

@Component
public interface IEngine {
    public void startEngine();
    public void stopEngine();
}
