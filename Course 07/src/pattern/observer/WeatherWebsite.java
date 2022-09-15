package pattern.observer;

import pattern.observer.models.Observer;
import pattern.observer.models.Weather;

public class WeatherWebsite implements Observer<Weather>
{
    private String name;

    public WeatherWebsite(String name)
    {
        this.name = name;
    }

    @Override
    public void update(Weather value)
    {
        System.out.println("At " + name + ", the weather is: ");
        System.out.println("Temperature:" + value.getTemperature() + "\nHumidity:" + value.getHumidity() + "\nPressure:" + value.getPressure());
    }
}
