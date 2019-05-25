package lesson4.bridge.devices;

import lesson4.bridge.storage.DB;

public class Speaker implements Device {
    private boolean on = false;
    private int volume = 10;
    private DB db;

    public Speaker(DB db) {
        this.db = db;
    }

    @Override
    public void on() {
        on = true;
    }

    @Override
    public void off() {
        on = false;
    }

    @Override
    public void volumeUp() {
        volume += 5;
    }

    @Override
    public void volumeDown() {
        volume -= 5;
    }

    @Override
    public String find(String song) {
        for(String s : db.getSongs()) {
            if(song.equalsIgnoreCase(s)) {
                return s;
            }
        }
        return "No such song";
    }
}
