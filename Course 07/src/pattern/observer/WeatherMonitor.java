package pattern.observer;

import pattern.observer.models.Observer;
import pattern.observer.models.Weather;

public class WeatherMonitor implements Observer<Weather>
{
    @Override
    public void update(Weather value)
    {
        System.out.println("T:" + value.getTemperature() + " H:" + value.getHumidity() + " P:" + value.getPressure());
    }
}
