package com.nyansapo.client_service.models;

import javax.persistence.Id;

public class OrderType {
    @Id
    private int id;
    private String side;

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
