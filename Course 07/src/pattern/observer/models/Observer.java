package pattern.observer.models;

public interface Observer<T>
{
    void update(T value);
}
