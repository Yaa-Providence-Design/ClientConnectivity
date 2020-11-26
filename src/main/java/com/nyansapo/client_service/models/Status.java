package com.nyansapo.client_service.models;

import javax.persistence.*;

@Entity
@Table(name = "status")
public class Status {
    @Id
    private int id;
    private String statusName;

    @OneToOne(targetEntity = Order.class, cascade = CascadeType.ALL)
    private Order order;

    public Status(String statusName) {
        this.statusName = statusName;
    }

    public Status() {
    }

    public int getId() {
        return id;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}

