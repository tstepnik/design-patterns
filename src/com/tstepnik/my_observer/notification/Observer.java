package com.tstepnik.my_observer.notification;

import com.tstepnik.my_observer.weater_forecast.WeatherForecast;

public interface Observer {
    public default void updateForecast(WeatherForecast weatherForecast) {

    }
}
