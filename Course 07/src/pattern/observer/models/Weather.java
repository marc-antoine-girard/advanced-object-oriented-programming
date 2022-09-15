package pattern.observer.models;

// Can be converted in one line using record
// public record Weather(double pressure, double humidity, double temperature) { }
public class Weather
{
    private final double pressure;
    private final double humidity;
    private final double temperature;

    public Weather(double pressure, double humidity, double temperature)
    {
        this.pressure = pressure;
        this.humidity = humidity;
        this.temperature = temperature;
    }


    public double getPressure()
    {
        return pressure;
    }

    public double getHumidity()
    {
        return humidity;
    }

    public double getTemperature()
    {
        return temperature;
    }
}
