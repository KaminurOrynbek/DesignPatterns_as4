package Observer;

public class WeatherMonitoringSystem {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherData.addDisplay(currentDisplay);
        weatherData.addDisplay(statisticsDisplay);
        weatherData.addDisplay(forecastDisplay);

        // Simulating weather data updates
        weatherData.setWeatherData(80, 65, 30.4f);
        System.out.println();
        weatherData.setWeatherData(82, 70, 29.2f);
        System.out.println();
        weatherData.setWeatherData(78, 90, 29.2f);
    }
}
