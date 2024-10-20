package observerDesignPattern.observable;

import observerDesignPattern.observer.NotificationObserver;

import java.util.Observer;

public interface StocksObservable {
    public void addObserver(NotificationObserver observer);
    public void removeObserver(NotificationObserver observer);
    public void notifyObservers();
    public void setStockCount(int newStockCount);
    public int getStockCount();
}
