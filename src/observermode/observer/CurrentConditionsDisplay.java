package observermode.observer;

import observermode.DisplayEelment;
import observermode.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayEelment {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("现在的温度是:" + temperature);
        System.out.println("现在的湿度是:" + humidity);
    }
}
