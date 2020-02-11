package com.epam.lab.hw_3_oop_basics.goods_for_repair.paints_varnishes.paints_varnishes_goods;

import com.epam.lab.hw_3_oop_basics.goods_for_repair.paints_varnishes.PaintsAndVarnishesProduct;

public class Varnish extends PaintsAndVarnishesProduct {
    public Varnish(float price, boolean quickDrying, boolean smell) {
        super(price, "Varnish", quickDrying, smell);
    }

    @Override
    public String toString() {
        return "Goods: " +
                "name=" + getName() +
                ", price=" + getPrice() +
                ", quickly drying=" + isQuickDrying() +
                ", smell=" + isSmell();
    }
}
