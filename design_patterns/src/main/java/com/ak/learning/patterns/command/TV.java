package com.ak.learning.patterns.command;


public enum TV {
    INSTANCE;

    public void increaseVolume() {
        System.out.println("Volume of the TV has been increased");
    }

    public void decreaseVolume() {
        System.out.println("Volume of the TV has been decreased");
    }

    public void switchOn() {
        System.out.println("TV has been switched on");
    }

    public void switchOff() {
        System.out.println("TV has been switched off");
    }

    public void goToChannel(int channelNo) {
        System.out.println("Switched to channel " + channelNo);
    }
}
