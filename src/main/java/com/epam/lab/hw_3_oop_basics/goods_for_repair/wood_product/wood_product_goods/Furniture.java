package com.epam.lab.hw_3_oop_basics.goods_for_repair.wood_product.wood_product_goods;

import com.epam.lab.hw_3_oop_basics.goods_for_repair.wood_product.WoodProduct;

public class Furniture extends WoodProduct {

    public Furniture(float price, int height, int width, int thickness, String typeOfWood, String color) {
        super(price, "Furniture", height, width, thickness, typeOfWood, color);
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
                " ;";
    }
}
