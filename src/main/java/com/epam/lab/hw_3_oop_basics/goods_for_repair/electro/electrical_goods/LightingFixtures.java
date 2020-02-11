package com.epam.lab.hw_3_oop_basics.goods_for_repair.electro.electrical_goods;


import com.epam.lab.hw_3_oop_basics.goods_for_repair.electro.Electric;

public class LightingFixtures extends Electric {
    private String color;

    public LightingFixtures(float price, int maxPower, String color) {
        super(price, "LightingFixtures", maxPower);
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
