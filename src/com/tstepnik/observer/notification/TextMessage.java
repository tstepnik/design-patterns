package com.tstepnik.observer.notification;

import com.tstepnik.observer.order.Order;

public class TextMessage implements Observer{

    public void update(Order order) {
        System.out.println("SMS - zamównienie numer: " + order.getOrderNumber() + " zmieniło status na : " + order.getOrderStatus());
    }
}
