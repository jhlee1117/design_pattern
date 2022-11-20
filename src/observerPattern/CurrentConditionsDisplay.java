package observerPattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;
    private String songName;
    private String artist;
    private MusicData musicData;

    public CurrentConditionsDisplay(WeatherData weatherData, MusicData musicData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        this.musicData = musicData;
        musicData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("현재 상태: 온도 " + temperature
        + "F, 습도 " + humidity + "%");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display2() {
        System.out.println("현재 음악: " + songName
                + "아티스트: " + artist);
    }

    @Override
    public void update(String songName, String artist) {
        this.artist = artist;
        this.songName = songName;
        display2();
    }
}
