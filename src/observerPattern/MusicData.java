package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class MusicData implements Subject {

    private List<Observer> observers;
    private String songName;
    private String artist;

    public MusicData() { observers = new ArrayList<>(); }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(songName, artist);
        }
    }

    public void songChanged() {

        notifyObservers();

    }

    public void setSongs(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
        songChanged();
    }
}
