package org.example.BehavorialPatterns.Command;

public class TurnTVOff implements Command {

    ElectronicDevice television;

    public TurnTVOff(ElectronicDevice television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOff();
    }
}
