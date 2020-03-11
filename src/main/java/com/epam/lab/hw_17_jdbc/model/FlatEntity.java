package com.epam.lab.hw_17_jdbc.model;

public class FlatEntity {
    private int id;
    private int ownerId;
    private int realtorId;
    private String address;
    private int floor;
    private int roomCount;
    private int square;
    private String type;
    private int price;

    public FlatEntity() {
    }

    public FlatEntity(int id, int ownerId, int realtorId, String address, int floor, int roomCount, int square, String type, int price) {
        this.id = id;
        this.ownerId = ownerId;
        this.realtorId = realtorId;
        this.address = address;
        this.floor = floor;
        this.roomCount = roomCount;
        this.square = square;
        this.type = type;
        this.price = price;
    }

    public FlatEntity(int ownerId, int realtorId, String address, int floor, int roomCount, int square, String type, int price) {
        this.ownerId = ownerId;
        this.realtorId = realtorId;
        this.address = address;
        this.floor = floor;
        this.roomCount = roomCount;
        this.square = square;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getRealtorId() {
        return realtorId;
    }

    public void setRealtorId(int realtorId) {
        this.realtorId = realtorId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FlatEntity{" +
                "id=" + id +
                ", ownerId=" + ownerId +
                ", realtorId=" + realtorId +
                ", address='" + address + '\'' +
                ", floor=" + floor +
                ", roomCount=" + roomCount +
                ", square=" + square +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
