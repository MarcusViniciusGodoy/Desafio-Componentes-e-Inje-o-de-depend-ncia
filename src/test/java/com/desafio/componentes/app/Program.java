package com.desafio.componentes.app;

import com.desafio.componentes.Service.OrderService;
import com.desafio.componentes.Service.ShippingService;
import com.desafio.componentes.entities.Order;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
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
