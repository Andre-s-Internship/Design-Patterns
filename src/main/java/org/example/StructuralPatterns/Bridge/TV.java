package org.example.StructuralPatterns.Bridge;

public class TV extends Device {
    @Override
    public void buttonFivePressed() {
        System.out.println("Go to next channel");
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("Go to previous channel");
    }
}
