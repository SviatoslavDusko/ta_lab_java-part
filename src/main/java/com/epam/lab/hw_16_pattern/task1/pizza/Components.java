package com.epam.lab.hw_16_pattern.task1.pizza;

import java.util.List;

public class Components {
    private String dough;
    private String sauce;
    private List<String> topping;

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(List<String> topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Components{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", topping=" + topping +
                '}';
    }
}
