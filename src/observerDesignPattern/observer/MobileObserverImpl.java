package observerDesignPattern.observer;

import observerDesignPattern.observable.StocksObservable;

import java.util.Observer;

public class MobileObserverImpl implements NotificationObserver{
    private StocksObservable stocksObservable;
    private int phone;
    public MobileObserverImpl(StocksObservable stocksObservable, int phone) {
        this.stocksObservable = stocksObservable;
        this.phone = phone;
    }
    @Override
    public void update() {
        notifyOnPhone("stock is back: " + stocksObservable.getStockCount() );
    }

    private void notifyOnPhone(String msg){
        System.out.println(msg + " is sent to on num: " + this.phone);
    }
}
