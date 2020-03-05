package com.epam.lab.hw_16_pattern.task1.pizza;

public interface PizzaInterface {
    PizzaInterface prepare(int diameter);

    PizzaInterface bake(String city);

    PizzaInterface cut(int pieces);

    PizzaInterface box();
}
