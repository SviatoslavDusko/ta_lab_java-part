package com.epam.lab.hw_17_jdbc.model;

public class OrderEntity {
    private int id;
    private int FlatId;
    private int ClientId;

    public OrderEntity() {
    }

    public OrderEntity(int id, int flatId, int clientId) {
        this.id = id;
        FlatId = flatId;
        ClientId = clientId;
    }

    public OrderEntity(int flatId, int clientId) {
        FlatId = flatId;
        ClientId = clientId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFlatId() {
        return FlatId;
    }

    public void setFlatId(int flatId) {
        FlatId = flatId;
    }

    public int getClientId() {
        return ClientId;
    }

    public void setClientId(int clientId) {
        ClientId = clientId;
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "id=" + id +
                ", FlatId=" + FlatId +
                ", ClientId=" + ClientId +
                '}';
    }
}
