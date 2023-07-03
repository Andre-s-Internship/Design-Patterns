package org.example.StructuralPatterns.Adapter;

public class USBACharger implements Charger{
    @Override
    public void chargeWithUSBA() {
        System.out.println("Charging with USB");
    }
}
