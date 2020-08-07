package com.epam.lab.hw_3_oop_basics;

public class Goods {
    private final float price;
    private final String name;

    public Goods(float price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
