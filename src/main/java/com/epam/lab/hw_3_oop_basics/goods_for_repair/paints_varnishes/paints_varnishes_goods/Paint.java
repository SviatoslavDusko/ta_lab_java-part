package com.epam.lab.hw_3_oop_basics.goods_for_repair.paints_varnishes.paints_varnishes_goods;

import com.epam.lab.hw_3_oop_basics.goods_for_repair.paints_varnishes.PaintsAndVarnishesProduct;

public class Paint extends PaintsAndVarnishesProduct {
    private String color;

    public Paint(float price, boolean quickDrying, boolean smell, String color) {
        super(price, "Paint", quickDrying, smell);
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
                ", quickly drying=" + isQuickDrying() +
                ", smell=" + isSmell() +
                ", color=" + getColor();
    }
}
