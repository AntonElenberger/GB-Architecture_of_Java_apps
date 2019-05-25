package lesson4.bridge.storage;

import java.util.ArrayList;
import java.util.List;

public class DB {
    private String song1 = "Prefect";
    private String song2 = "Wilde World";
    private List<String> songs = new ArrayList<String>();
    private String movie1 = "Aladdin";
    private String movie2 = "Brightburn";
    private List<String> movies = new ArrayList<String>();

    public void createSongsList() {
        songs.add(song1);
        songs.add(song2);
    }

    public void createMovieList() {
        movies.add(movie1);
        movies.add(movie2);
    }

    public List<String> getMovies() {
        return movies;
    }

    public List<String> getSongs() {
        return songs;
    }

    public String getSong1() {
        return song1;
    }

    public String getSong2() {
        return song2;
    }

    public String getMovie1() {
        return movie1;
    }

    public String getMovie2() {
        return movie2;
    }
}
