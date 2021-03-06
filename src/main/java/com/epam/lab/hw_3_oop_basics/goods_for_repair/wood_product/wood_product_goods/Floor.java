package com.epam.lab.hw_3_oop_basics.goods_for_repair.wood_product.wood_product_goods;

import com.epam.lab.hw_3_oop_basics.goods_for_repair.wood_product.WoodProduct;

public class Floor extends WoodProduct {
    private String type;

    public Floor(float price, int height, int width, int thickness, String typeOfWood, String color, String type) {
        super(price, "Floor", height, width, thickness, typeOfWood, color);
        this.type = type;
    }

    public String getType() {
        return type;
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
                ", type=" + getType() +
                " ;";
    }
}
