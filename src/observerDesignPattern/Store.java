package observerDesignPattern;

import observerDesignPattern.observable.MacbookObservableImpl;
import observerDesignPattern.observable.StocksObservable;
import observerDesignPattern.observer.EmailObserverImpl;
import observerDesignPattern.observer.MobileObserverImpl;
import observerDesignPattern.observer.NotificationObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable macbookobservable = new MacbookObservableImpl();

        NotificationObserver n1 = new EmailObserverImpl(macbookobservable, "omer@gmail.com");
        NotificationObserver n2 = new EmailObserverImpl(macbookobservable, "gupta@gmail.com");
        NotificationObserver n3 = new MobileObserverImpl(macbookobservable, 98978222);

        macbookobservable.addObserver(n1);
        macbookobservable.addObserver(n2);
        macbookobservable.addObserver(n3);

        macbookobservable.setStockCount(60);

    }
}
