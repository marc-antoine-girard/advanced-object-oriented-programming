package pattern.observer;

import pattern.observer.models.Weather;

public class ObserverDemo
{
    public static void demo()
    {
        WeatherSupplier supplier = new WeatherSupplier();

        supplier.subscribe(new WeatherWebsite("Meteomedia"));

        supplier.setWeatherConditions(new Weather(10, 1, 30));

        supplier.subscribe(new WeatherWebsite("Weathersite"));
        supplier.subscribe(new WeatherMonitor());

        supplier.setWeatherConditions(new Weather(2, 13, 50));
    }
}
