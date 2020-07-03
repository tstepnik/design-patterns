package com.tstepnik.observer;

import com.tstepnik.observer.notification.Email;
import com.tstepnik.observer.notification.MobileApp;
import com.tstepnik.observer.notification.TextMessage;
import com.tstepnik.observer.order.Order;
import com.tstepnik.observer.order.OrderStatus;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        System.out.println();

        order.notifyObservers();

        System.out.println();
        System.out.println("/////////////////////");
        System.out.println();

        order.changeOrderStatus(OrderStatus.WYSLANE);

        order.unregisterObserver(email);
        System.out.println();
        order.changeOrderStatus(OrderStatus.ODEBRANE);

    }
}
