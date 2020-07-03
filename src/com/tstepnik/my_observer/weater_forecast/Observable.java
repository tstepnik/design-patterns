package com.tstepnik.my_observer.weater_forecast;

import com.tstepnik.my_observer.notification.Observer;

public interface Observable {

    public void registerObserver(Observer observer);
    public void unregisterObserver(Observer observer);
    public void notifyObservers();

}
