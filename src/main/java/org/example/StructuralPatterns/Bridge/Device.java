package org.example.StructuralPatterns.Bridge;

public abstract class Device {

    public static boolean isOn;
    public static int volume = 0;

    public abstract void buttonFivePressed();
    public abstract void buttonSixPressed();

    public void buttonPlusPressed() {
        volume ++;
    }

    public void buttonMinusPressed() {
        volume --;
    }


}
