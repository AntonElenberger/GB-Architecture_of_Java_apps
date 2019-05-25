package lesson4.bridge.devices;

public interface Device {
    void on();
    void off();
    void volumeUp();
    void volumeDown();
    String find(String song);
}
