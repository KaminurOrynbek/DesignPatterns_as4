package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<WeatherDisplay> displays;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        displays = new ArrayList<>();
    }

    public void registerDisplay(WeatherDisplay display) {
        displays.add(display);
    }

    public void removeDisplay(WeatherDisplay display) {
        displays.remove(display);
    }

    public void notifyDisplays() {
        for (WeatherDisplay display : displays) {
            display.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyDisplays();
    }
}
