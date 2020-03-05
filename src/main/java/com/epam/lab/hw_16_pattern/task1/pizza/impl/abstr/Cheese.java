package com.epam.lab.hw_16_pattern.task1.pizza.impl.abstr;

import com.epam.lab.hw_16_pattern.task1.constants.Cities;
import com.epam.lab.hw_16_pattern.task1.constants.Doughs;
import com.epam.lab.hw_16_pattern.task1.constants.Sauces;
import com.epam.lab.hw_16_pattern.task1.constants.Toppings;
import com.epam.lab.hw_16_pattern.task1.pizza.Components;
import com.epam.lab.hw_16_pattern.task1.pizza.impl.Pizza;

import java.util.ArrayList;

public class Cheese extends Pizza {
    @Override
    public Pizza bake(String city) {
        Components components1 = new Components();
        ArrayList listWithToppings = new ArrayList();

        switch (city) {
            case (Cities.LVIV): {
                listWithToppings.add(Toppings.CHEESE);
                listWithToppings.add(Toppings.CHEESE);
                listWithToppings.add(Toppings.HAM);
                components1.setDough(Doughs.CRUST);
                components1.setSauce(Sauces.PLUM_TOMATO);
                break;
            }
            case (Cities.DNIPRO): {
                listWithToppings.add(Toppings.CHEESE);
                listWithToppings.add(Toppings.CHICKEN);
                listWithToppings.add(Toppings.HAM);
                components1.setDough(Doughs.CRUST);
                components1.setSauce(Sauces.PESTO);
                break;
            }
            case (Cities.KYIV): {
                listWithToppings.add(Toppings.CHEESE);
                listWithToppings.add(Toppings.MUSHROOMS);
                listWithToppings.add(Toppings.HAM);
                components1.setDough(Doughs.CRUST);
                components1.setSauce(Sauces.MARINARA);
                break;
            }
        }
        if (listWithToppings.isEmpty()) {
            System.out.println(
                    String.format("Please enter correct city: %s, %s, %s.", Cities.LVIV, Cities.DNIPRO, Cities.KYIV));
        }
        components1.setTopping(listWithToppings);
        setComponents(components1);
        return this;
    }
}
