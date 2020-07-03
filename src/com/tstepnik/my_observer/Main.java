package com.tstepnik.my_observer;

import com.tstepnik.my_observer.notification.InternetNews;
import com.tstepnik.my_observer.notification.RadioNews;
import com.tstepnik.my_observer.notification.TvNews;
import com.tstepnik.my_observer.weater_forecast.WeatherForecast;

public class Main {
    public static void main(String[] args) {

        WeatherForecast weatherForecast = new WeatherForecast(23,1320);
        RadioNews radio = new RadioNews();
        InternetNews internet = new InternetNews();
        TvNews tv = new TvNews();


        weatherForecast.registerObserver(radio);
        weatherForecast.registerObserver(internet);
        weatherForecast.registerObserver(tv);
        System.out.println("/////////////////////////");
        weatherForecast.notifyObservers();
        System.out.println("/////////////////////////");
        weatherForecast.unregisterObserver(radio);
        weatherForecast.unregisterObserver(tv);
        System.out.println("Nowa prognoza pogodny - powiadomienie tylko dla serwisu internetowego:");
        System.out.println();
        weatherForecast.update(121,99);
    }
}
