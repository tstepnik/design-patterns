package com.tstepnik.my_observer.notification;

import com.tstepnik.my_observer.weater_forecast.WeatherForecast;

public class InternetNews implements Observer {

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet - nowa prognoza pogody: " + weatherForecast.toString());
    }
}
