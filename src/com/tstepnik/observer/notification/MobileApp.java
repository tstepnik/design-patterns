package com.tstepnik.observer.notification;

import com.tstepnik.observer.order.Order;

public class MobileApp implements Observer{

    public void update(Order order) {
        System.out.println("Aplikacja mobilna - zamównienie numer: " + order.getOrderNumber() + " zmieniło status na : " + order.getOrderStatus());
    }
}
