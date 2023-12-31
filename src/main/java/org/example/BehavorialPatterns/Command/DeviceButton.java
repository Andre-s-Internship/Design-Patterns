package org.example.BehavorialPatterns.Command;

public class DeviceButton {

    Command command;

    public DeviceButton(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

}
