package org.example.BehavorialPatterns.Command;

public class Television implements ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("TV turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turned off");
    }
}
