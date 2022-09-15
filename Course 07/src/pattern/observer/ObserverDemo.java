package pattern.observer;

import pattern.observer.models.Weather;

public class ObserverDemo
{
    public static void demo()
    {
        // Supplies the weather. Informs all the listeners when the weather changes
        WeatherSupplier supplier = new WeatherSupplier();

        // All the listeners
        WeatherWebsite meteomedia = new WeatherWebsite("Meteomedia");
        WeatherWebsite weathersite = new WeatherWebsite("Weathersite");
        WeatherMonitor observer = new WeatherMonitor();

        // The listeners subscribe to the weather supplier
        supplier.subscribe(meteomedia);
        supplier.subscribe(weathersite);
        supplier.subscribe(observer);

        // Change the weather. This will inform all the listeners
        supplier.setWeatherConditions(new Weather(10, 1, 30));
        supplier.setWeatherConditions(new Weather(2, 13, 50));
    }
}
