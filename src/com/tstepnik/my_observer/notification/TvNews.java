package com.tstepnik.my_observer.notification;

import com.tstepnik.my_observer.weater_forecast.WeatherForecast;

public class TvNews implements Observer{

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Telewizja - nowa prognoza pogody: " + weatherForecast.toString());
    }
}
