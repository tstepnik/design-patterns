package com.tstepnik.observer.notification;

import com.tstepnik.observer.order.Order;

public interface Observer {

    void update(Order order);

}
