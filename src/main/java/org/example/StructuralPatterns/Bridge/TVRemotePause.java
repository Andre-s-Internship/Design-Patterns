package org.example.StructuralPatterns.Bridge;

public class TVRemotePause extends RemoteButton{
    public TVRemotePause(Device device) {
        super(device);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("Playing paused");
    }
}
