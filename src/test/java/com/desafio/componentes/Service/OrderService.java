package com.desafio.componentes.Service;

import com.desafio.componentes.entities.Order;

public class OrderService {

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {
        return order.getBasic() - order.getDiscount() + shippingService.shipment(order.getOrder());
    }
}
