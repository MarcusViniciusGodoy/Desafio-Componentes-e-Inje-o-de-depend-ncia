package com.desafio.componentes.Service;

import com.desafio.componentes.entities.Order;

public class OrderService {

    ShippingService shippingService = new ShippingService();

    public double total(Order order) {
        return order.getBasic() - order.getDiscount() + shippingService.shipment(order.getOrder());
    }
}
