package pattern.observer;

import pattern.observer.models.Observable;
import pattern.observer.models.Observer;
import pattern.observer.models.Weather;

import java.util.ArrayList;

public class WeatherSupplier implements Observable<Weather>
{
    private final ArrayList<Observer<Weather>> observers;

    public WeatherSupplier()
    {
        observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer<Weather> observer)
    {
        if (!observers.contains(observer))
            observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer<Weather> observer)
    {
        observers.remove(observer);
    }

    public void setWeatherConditions(Weather weather)
    {
        for (Observer<Weather> observer : observers)
        {
            System.out.println("-------------------");
            observer.update(weather);
        }
    }
}
