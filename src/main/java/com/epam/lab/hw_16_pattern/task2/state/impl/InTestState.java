package com.epam.lab.hw_16_pattern.task2.state.impl;

import com.epam.lab.hw_16_pattern.task2.Order;
import com.epam.lab.hw_16_pattern.task2.state.State;

public class InTestState implements State {
    @Override
    public void done(Order order) {
        order.setState(new DoneState());
        System.out.println("Done!");
    }

    @Override
    public void blocked(Order order) {
        order.setState(new BlockedState());
        System.out.println("In blocked");
    }
}
