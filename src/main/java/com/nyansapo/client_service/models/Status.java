package com.nyansapo.client_service.models;

import javax.persistence.Id;

public class Status {
    @Id
    private int id;
    private String statusName;

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

