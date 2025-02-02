package com.desafio.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService{

    public double shipment(double basic){
        if (basic < 100) {
        	return 20;
        }else if(basic > 100 && basic < 200) {
        	return 12;
        }else {
        	return 0;
        }
    }
}
