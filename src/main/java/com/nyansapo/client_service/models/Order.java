package com.nyansapo.client_service.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "order")
public class Order {
    @Id
    private int id;
    private String ticker;
    private double quantity;
    private double price;
    private String side;

    @OneToOne(targetEntity = OrderType.class, cascade = CascadeType.ALL)
    private OrderType orderType;

    @OneToOne(targetEntity = Status.class, cascade = CascadeType.ALL)
    private Status status;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Portfolio> portfolioList;

    @OneToOne(targetEntity = Client.class, cascade = CascadeType.ALL)
    private Client client;

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
