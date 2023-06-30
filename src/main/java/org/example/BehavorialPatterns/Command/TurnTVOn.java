package org.example.BehavorialPatterns.Command;

public class TurnTVOn implements Command{
    ElectronicDevice television;

    public TurnTVOn(ElectronicDevice electronicDevice) {
        television = electronicDevice;
    }

    @Override
    public void execute() {
        television.turnOn();
    }
}
