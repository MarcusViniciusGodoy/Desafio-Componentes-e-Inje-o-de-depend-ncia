package com.desafio.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService{

    public double shipment(double basic){
        if (basic < 100.00){
            return 20.0;
        } else if (basic > 200.00) {
            return 0.0;
        }else{
            return 12.0;
        }
    }
}
