package com.epam.lab.hw_3_oop_basics.goods_for_repair.paints_varnishes;

import com.epam.lab.hw_3_oop_basics.Goods;

public class PaintsAndVarnishesProduct extends Goods {
    private boolean quickDrying;
    private boolean smell;

    public PaintsAndVarnishesProduct(float price, String name, boolean quickDrying, boolean smell) {
        super(price, name);
        this.quickDrying = quickDrying;
        this.smell = smell;
    }

    public boolean isQuickDrying() {
        return quickDrying;
    }

    public boolean isSmell() {
        return smell;
    }
}
