package org.example.BehavorialPatterns.Command;

public class Main {
    public static void main(String[] args) {
        ElectronicDevice device = TVRemote.getDevice();
        TurnTVOn onCommand = new TurnTVOn(device);
        TurnTVOff offCommand = new TurnTVOff(device);
        DeviceButton onPressed = new DeviceButton(onCommand);
        DeviceButton offPressed = new DeviceButton(offCommand);
        onPressed.press();
        offPressed.press();
    }
}
