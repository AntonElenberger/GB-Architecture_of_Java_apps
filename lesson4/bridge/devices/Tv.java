package lesson4.bridge.devices;

import lesson4.bridge.storage.DB;

public class Tv implements Device {

    private boolean on = false;
    private int volume = 10;
    private DB db;

    public Tv(DB db) {
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
    public String find(String movie) {
        for(String s : db.getMovies()) {
            if(movie.equalsIgnoreCase(s)) {
                return s;
            }
        }
        return "No such movie";
    }
}
