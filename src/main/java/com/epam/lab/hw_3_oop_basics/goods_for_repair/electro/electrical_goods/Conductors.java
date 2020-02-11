package com.epam.lab.hw_3_oop_basics.goods_for_repair.electro.electrical_goods;

import com.epam.lab.hw_3_oop_basics.goods_for_repair.electro.Electric;

public class Conductors extends Electric {
    private float diameter;

    public Conductors(float price, int maxPower, float diameter) {
        super(price, "Conductors", maxPower);
        this.diameter = diameter;
    }

    public float getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Goods: " +
                "name=" + getName() +
                ", price=" + getPrice() +
                ", max power= " + getMaxPower() +
                ", color=" + getDiameter() +
                " ;";
    }
}
