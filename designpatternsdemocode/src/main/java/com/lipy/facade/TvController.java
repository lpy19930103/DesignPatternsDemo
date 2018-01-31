package com.lipy.facade;

/**
 * 门面
 * Created by lipy on 2018/1/31.
 */

public class TvController {

    private ChannelSystem channelSystem = new ChannelSystem();
    private PowerSystem powerSystem = new PowerSystem();
    private VoiceSystem voiceSystem = new VoiceSystem();

    public void next() {
        channelSystem.next();
    }

    public void prev() {
        channelSystem.prev();
    }

    public void turnUp() {
        voiceSystem.turnUp();
    }

    public void turnDown() {
        voiceSystem.turnDown();
    }

    public void powerOn() {
        powerSystem.powerOn();
    }

    public void powerOff() {
        powerSystem.powerOff();
    }
}
