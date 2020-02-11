package com.epam.lab.hw_3_oop_basics.goods_for_repair.electro.electrical_goods;

import com.epam.lab.hw_3_oop_basics.goods_for_repair.electro.Electric;

public class Switch extends Electric {
    private String color;

    public Switch(float price, int maxPower, String color) {
        super(price, "Switch", maxPower);
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
