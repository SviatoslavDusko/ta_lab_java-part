package com.epam.lab.hw_3_oop_basics.goods_for_repair.electro;

import com.epam.lab.hw_3_oop_basics.Goods;

public class Electric extends Goods {
    private int maxPower;

    public Electric(float price, String name, int maxPower) {
        super(price, name);
        this.maxPower = maxPower;
    }

    public int getMaxPower() {
        return maxPower;
    }
}
