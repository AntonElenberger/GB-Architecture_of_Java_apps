package lesson4.bridge.controls;

public interface Control {
    void powerOn();
    void powerOff();
    String find(String song);
    void volumeUp();
    void volumeDown();
}
