package org.example.StructuralPatterns.Bridge;

public class DVD extends Device{
    @Override
    public void buttonFivePressed() {
        System.out.println("Skip to next video");
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("Skip to previous video");
    }
}
