package com.epam.lab.hw_16_pattern.task2.state.impl;

import com.epam.lab.hw_16_pattern.task2.Order;
import com.epam.lab.hw_16_pattern.task2.state.State;

public class NewTaskState implements State {
    @Override
    public void addTask(Order order) {
        order.addTaskToList();
        System.out.println("Add Task");
    }

    @Override
    public void inProgress(Order order) {
        order.setState(new InProgressState());
        System.out.println("In progress");
    }

    @Override
    public void blocked(Order order) {
        order.setState(new BlockedState());
        System.out.println("In blocked");
    }
}
