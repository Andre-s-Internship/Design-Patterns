package org.example.StructuralPatterns.Bridge;

public abstract class RemoteButton {
    public Device device;
    public RemoteButton(Device device) {
        this.device = device;
    }

    public void buttonFivePressed() {
        device.buttonFivePressed();
    }

    public void buttonSixPressed() {
        device.buttonSixPressed();
    }

    public abstract void buttonNinePressed();

}
