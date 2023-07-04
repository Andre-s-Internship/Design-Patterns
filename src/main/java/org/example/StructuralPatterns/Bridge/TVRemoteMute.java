package org.example.StructuralPatterns.Bridge;

public class TVRemoteMute extends RemoteButton{
    public TVRemoteMute(Device device) {
        super(device);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("Muted the device");
    }
}
