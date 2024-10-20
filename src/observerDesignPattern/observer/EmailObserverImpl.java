package observerDesignPattern.observer;

import observerDesignPattern.observable.StocksObservable;

import java.util.Observer;

public class EmailObserverImpl implements NotificationObserver{
    StocksObservable stocksObservable;
    String emailId;

    public EmailObserverImpl(StocksObservable stocksObservable, String emailId) {
        this.stocksObservable = stocksObservable;
        this.emailId = emailId;
    }
    @Override
    public void update() {
        sendEmail(emailId, "product in stocks");
    }

    private void sendEmail(String emailId, String msg){

        System.out.println("Sending email to " + emailId + " new stock: " + stocksObservable.getStockCount());
    }
}
