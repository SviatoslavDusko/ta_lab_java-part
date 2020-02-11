package com.epam.lab.hw_3_oop_basics.goods_for_repair.wood_product.wood_product_goods;

import com.epam.lab.hw_3_oop_basics.goods_for_repair.wood_product.WoodProduct;

public class Door extends WoodProduct {
    private boolean window;

    public Door(float price, int height, int width, int thickness, String typeOfWood, String color, boolean window) {
        super(price, "Door", height, width, thickness, typeOfWood, color);
        this.window = window;
    }

    public boolean hasWindow() {
        return window;
    }

    @Override
    public String toString() {
        return "Goods: " +
                "name=" + getName() +
                ", price=" + getPrice() +
                ", height=" + getHeight() +
                ", width=" + getWidth() +
                ", thickness=" + getThickness() +
                ", type of wood=" + getTypeOfWood() +
                ", color=" + getColor() +
                ", window=" + hasWindow() +
                " ;";
    }
}
