package com.tstepnik.observer.notification;

import com.tstepnik.observer.order.Order;

public class Email implements Observer {


    public void update(Order order) {
        System.out.println("E-mail - zamównienie numer: " + order.getOrderNumber() + " zmieniło status na : " + order.getOrderStatus());
    }
}
