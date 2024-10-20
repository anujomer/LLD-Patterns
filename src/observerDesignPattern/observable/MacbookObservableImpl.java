package observerDesignPattern.observable;

import observerDesignPattern.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class MacbookObservableImpl implements StocksObservable {

    public List<NotificationObserver> notificationObserver = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void addObserver(NotificationObserver observer) {
        notificationObserver.add(observer);
    }

    @Override
    public void removeObserver(NotificationObserver observer) {
        notificationObserver.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(NotificationObserver observer : notificationObserver) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {



        this.stockCount  += newStockCount;
        notifyObservers();
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
