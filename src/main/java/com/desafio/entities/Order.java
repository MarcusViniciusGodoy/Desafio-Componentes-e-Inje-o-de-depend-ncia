package com.desafio.entities;

public class Order {

    private Integer order;
    private double basic;
    private double discount;

    public Order() {
    }

    public Order(Integer order, double basic, double discount) {
        this.order = order;
        this.basic = basic;
        this.discount = discount;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getDiscount() {
        discount = basic*(discount/100);
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
