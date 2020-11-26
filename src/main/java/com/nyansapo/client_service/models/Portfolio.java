package com.nyansapo.client_service.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "portfolio")
public class Portfolio {
    @Id
    private String id;
    private String name;
    private String stock_id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Stock> stockList;

    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStock_id() {
        return stock_id;
    }

    public void setStock_id(String stock_id) {
        this.stock_id = stock_id;
    }
}
