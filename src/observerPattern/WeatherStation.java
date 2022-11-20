package observerPattern;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        MusicData musicData = new MusicData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData, musicData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        musicData.setSongs("Kids are bone stars","Lauv");
        musicData.setSongs("Stop and Stare","One Republic");
        musicData.setSongs("Over my head","The Fray");
    }
}
