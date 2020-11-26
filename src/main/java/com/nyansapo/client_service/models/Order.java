package com.nyansapo.client_service.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order {
    @Id
    private int id;
    private String ticker;
    private double quantity;
    private double price;
    private String side;

    public Order() {
    }

    public Order(String ticker, double quantity, double price, String side) {
        this.ticker = ticker;
        this.quantity = quantity;
        this.price = price;
        this.side = side;
    }
    public int getId() {
        return id;
    }
    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }
}
