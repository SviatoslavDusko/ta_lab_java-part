package com.epam.lab.hw_16_pattern.task1.pizza.impl;

import com.epam.lab.hw_16_pattern.task1.pizza.Components;
import com.epam.lab.hw_16_pattern.task1.pizza.PizzaInterface;

public abstract class Pizza implements PizzaInterface {
    private int diameter;
    private int pieces;
    private Components components;

    private void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    private void setPieces(int pieces) {
        this.pieces = pieces;
    }

    protected void setComponents(Components components) {
        this.components = components;
    }


    @Override
    public Pizza prepare(int diameter) {
        setDiameter(diameter);
        return this;
    }

    @Override
    public abstract Pizza bake(String city);

    @Override
    public Pizza cut(int pieces) {
        setPieces(pieces);
        return this;
    }

    @Override
    public Pizza box() {
        return this;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "diameter=" + diameter +
                ", pieces=" + pieces +
                ", components=" + components +
                '}';
    }
}
