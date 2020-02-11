package com.epam.lab.hw_3_oop_basics.goods_for_repair.plumbing;

import com.epam.lab.hw_3_oop_basics.Goods;

public class Plumbing extends Goods {
    private int height;
    private int width;
    private String material;
    private String color;

    public Plumbing(float price, String name, int height, int width, String material, String color) {
        super(price, name);
        this.height = height;
        this.width = width;
        this.material = material;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
}
