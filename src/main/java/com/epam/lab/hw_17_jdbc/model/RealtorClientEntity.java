package com.epam.lab.hw_17_jdbc.model;

public class RealtorClientEntity {
    private int id;
    private int realtorId;
    private int clientId;

    public RealtorClientEntity() {
    }

    public RealtorClientEntity(int realtorId, int clientId) {
        this.realtorId = realtorId;
        this.clientId = clientId;
    }

    public RealtorClientEntity(int id, int realtorId, int clientId) {
        this.id = id;
        this.realtorId = realtorId;
        this.clientId = clientId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRealtorId() {
        return realtorId;
    }

    public void setRealtorId(int realtorId) {
        this.realtorId = realtorId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "RealtorClientEntity{" +
                "id=" + id +
                ", realtorId=" + realtorId +
                ", clientId=" + clientId +
                '}';
    }
}
