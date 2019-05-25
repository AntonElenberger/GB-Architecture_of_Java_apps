package lesson4.bridge;

import lesson4.bridge.controls.SpeakerControl;
import lesson4.bridge.controls.TvControl;
import lesson4.bridge.devices.Device;
import lesson4.bridge.devices.Speaker;
import lesson4.bridge.devices.Tv;
import lesson4.bridge.storage.DB;

public class MainClass {
    public static void main(String[] args) {
        DB db = new DB();
        db.createSongsList();
        db.createMovieList();
        Device tv = new Tv(db);
        Device speaker = new Speaker(db);

        TvControl tvControl = new TvControl(tv);
        SpeakerControl speakerControl = new SpeakerControl(speaker);

        tvControl.powerOn();
        System.out.println(tvControl.find("aladdin"));
        tvControl.volumeUp();
        tvControl.powerOff();
        speakerControl.powerOn();
        System.out.println(speakerControl.find("Shallow"));
        speakerControl.powerOff();
    }
}
