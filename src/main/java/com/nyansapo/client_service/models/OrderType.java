package com.nyansapo.client_service.models;

import javax.persistence.*;

@Entity
@Table(name = "orderType")
public class OrderType {
    @Id
    private int id;
    private String side;

    @OneToOne(targetEntity = Order.class, cascade = CascadeType.ALL)
    private Order order;

    public OrderType() {
    }

    public OrderType(String side) {
        this.side = side;
    }
    public int getId() {
        return id;
    }
    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }
}
