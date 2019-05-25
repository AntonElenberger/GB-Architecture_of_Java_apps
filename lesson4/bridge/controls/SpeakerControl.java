package lesson4.bridge.controls;

import lesson4.bridge.devices.Device;

public class SpeakerControl implements Control {
    Device device;

    public SpeakerControl() {
    }

    public SpeakerControl(Device device) {
        this.device = device;
    }

    @Override
    public void powerOn() {
        device.on();
    }

    @Override
    public void powerOff() {
        device.off();
    }

    @Override
    public String find(String song) {
        return device.find(song);
    }

    @Override
    public void volumeUp() {
        device.volumeUp();
    }

    @Override
    public void volumeDown() {
        device.volumeDown();
    }
}
