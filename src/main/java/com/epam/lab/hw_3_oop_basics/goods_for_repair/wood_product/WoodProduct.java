package com.epam.lab.hw_3_oop_basics.goods_for_repair.wood_product;

import com.epam.lab.hw_3_oop_basics.Goods;

public class WoodProduct extends Goods {
    private int height;
    private int width;
    private int thickness;
    private String typeOfWood;
    private String color;

    public WoodProduct(float price, String name, int height, int width, int thickness, String typeOfWood, String color) {
        super(price, name);
        this.height = height;
        this.width = width;
        this.thickness = thickness;
        this.typeOfWood = typeOfWood;
        this.color = color;
    }

    protected int getHeight() {
        return height;
    }

    protected int getWidth() {
        return width;
    }

    protected int getThickness() {
        return thickness;
    }

    protected String getTypeOfWood() {
        return typeOfWood;
    }

    protected String getColor() {
        return color;
    }
}
