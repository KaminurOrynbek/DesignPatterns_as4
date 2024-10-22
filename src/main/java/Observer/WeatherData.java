package Observer;

public class WeatherData {
    private WeatherStation weatherStation;

    public WeatherData() {
        weatherStation = new WeatherStation();
    }

    public void addDisplay(WeatherDisplay display) {
        weatherStation.registerDisplay(display);
    }

    public void setWeatherData(float temperature, float humidity, float pressure) {
        weatherStation.setMeasurements(temperature, humidity, pressure);
    }
}
