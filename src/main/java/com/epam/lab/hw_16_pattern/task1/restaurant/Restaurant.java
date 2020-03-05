package com.epam.lab.hw_16_pattern.task1.restaurant;

import com.epam.lab.hw_16_pattern.task1.constants.PizzaNames;
import com.epam.lab.hw_16_pattern.task1.pizza.impl.Pizza;
import com.epam.lab.hw_16_pattern.task1.pizza.impl.abstr.Cheese;
import com.epam.lab.hw_16_pattern.task1.pizza.impl.abstr.Clam;
import com.epam.lab.hw_16_pattern.task1.pizza.impl.abstr.Pepperoni;
import com.epam.lab.hw_16_pattern.task1.pizza.impl.abstr.Veggie;

public class Restaurant {
    private Pizza choosePizza(String pizzaName) {
        switch (pizzaName) {
            case (PizzaNames.CHEESE):
                return new Cheese();
            case (PizzaNames.CLAM):
                return new Clam();
            case (PizzaNames.PEPPERONI):
                return new Pepperoni();
            case (PizzaNames.VEGGIE):
                return new Veggie();
        }
        System.out.println(String.format("Please choose correct Pizza: %s, %s, %s, %s.",
                PizzaNames.CHEESE, PizzaNames.CLAM, PizzaNames.PEPPERONI, PizzaNames.VEGGIE));
        return new Cheese();//Default pizza
    }

    public Pizza makePizza(String pizzaName, int diameter, String city, int pieces) {
        return choosePizza(pizzaName)
                .prepare(diameter)
                .bake(city)
                .cut(pieces)
                .box();
    }
}
