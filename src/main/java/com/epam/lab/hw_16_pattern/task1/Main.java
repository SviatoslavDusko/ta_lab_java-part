package com.epam.lab.hw_16_pattern.task1;

import com.epam.lab.hw_16_pattern.task1.constants.Cities;
import com.epam.lab.hw_16_pattern.task1.constants.PizzaNames;
import com.epam.lab.hw_16_pattern.task1.constants.PizzaSizes;
import com.epam.lab.hw_16_pattern.task1.pizza.impl.Pizza;
import com.epam.lab.hw_16_pattern.task1.restaurant.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Pizza pizza1 = restaurant.makePizza(PizzaNames.CHEESE, PizzaSizes.BIG, Cities.KYIV, 8);
        Pizza pizza2 = restaurant.makePizza(PizzaNames.VEGGIE, PizzaSizes.SMALL, Cities.LVIV, 10);
        System.out.println(pizza1 + "\n" + pizza2);
    }
}
