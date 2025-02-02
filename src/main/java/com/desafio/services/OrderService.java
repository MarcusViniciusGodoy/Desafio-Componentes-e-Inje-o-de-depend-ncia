package com.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.entities.Order;

@Service
public class OrderService {

	@Autowired
    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {
        return order.getBasic() - order.getDiscount() + shippingService.shipment(order.getOrder());
    }
}
