package com.epam.lab.hw_3_oop_basics.goods_for_repair.electro.electrical_goods;

import com.epam.lab.hw_3_oop_basics.goods_for_repair.electro.Electric;

public class Socket extends Electric {
    private String color;

    public Socket(float price, int maxPower, String color) {
        super(price, "Socket", maxPower);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Goods: " +
                "name=" + getName() +
                ", price=" + getPrice() +
                ", max power= " + getMaxPower() +
                ", color=" + getColor() +
                " ;";
    }
}
