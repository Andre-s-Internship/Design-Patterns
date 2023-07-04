package org.example.StructuralPatterns.Adapter;

public class USBCCChargerAdapter implements Charger{
    USBCCharger usbCCharger;

    @Override
    public void chargeWithUSBA() {
        usbCCharger.chargeWithUSBC();
    }
}
