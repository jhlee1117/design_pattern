package observerPattern;

import java.util.ArrayList;
import java.util.List;

// 주제 인터페이스를 구현하는 날씨 정보 클래스
public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

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
//            observer.update(temperature, humidity, pressure);
            observer.update();
        }
    }

    public void measurementsChanged() {

        notifyObservers();

    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // 푸시 방식에서 풀 방식을 바꿀 경우, 옵저버가 온도 및 습도 데이터를 직접 가져올 수 있도록 함
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }
}
