package pattern.observer.models;

public interface Observable<T>
{
    void subscribe(Observer<T> observer);
    void unsubscribe(Observer<T> observer);
}
