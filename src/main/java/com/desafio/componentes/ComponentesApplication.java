package com.desafio.componentes;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.desafio.entities.Order;
import com.desafio.services.OrderService;
import com.desafio.services.ShippingService;

@SpringBootApplication
@ComponentScan({"com.desafio"})
public class ComponentesApplication implements CommandLineRunner{

	@Autowired
	private ShippingService shippingService;

	public static void main(String[] args) {
		SpringApplication.run(ComponentesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Dados do pedido");
        System.out.println("Digite o código do produto: ");
        Integer order = sc.nextInt();
        System.out.println("Digite o valor: ");
        double basic = sc.nextDouble();
        System.out.println("Digite o desconto: ");
        double discount = sc.nextDouble();
        Order order1 = new Order(order, basic, discount);
        
        ShippingService shippingService = new ShippingService();
        OrderService orderService = new OrderService(shippingService);

        double total = orderService.total(order1);
        //Saída
        System.out.println("Pedido código: " + order);
        System.out.println("Valor total: R$ " + total);

        sc.close();
	}

}
