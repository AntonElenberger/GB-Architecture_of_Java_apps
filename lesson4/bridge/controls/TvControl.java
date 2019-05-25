package lesson4.bridge.controls;

import lesson4.bridge.devices.Device;

public class TvControl implements Control {
    Device device;

    public TvControl(Device device) {
        this.device = device;
    }

    public TvControl() {
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
    public String find(String movie) {
        return device.find(movie);
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
