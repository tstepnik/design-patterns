package com.tstepnik.observer.order;

import com.tstepnik.observer.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);
        void unregisterObserver(Observer observer);
    void notifyObservers();

}
