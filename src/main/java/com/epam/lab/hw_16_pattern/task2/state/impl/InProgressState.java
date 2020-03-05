package com.epam.lab.hw_16_pattern.task2.state.impl;

import com.epam.lab.hw_16_pattern.task2.Order;
import com.epam.lab.hw_16_pattern.task2.state.State;

public class InProgressState implements State {
    @Override
    public void addTask(Order order) {
        order.addTaskToList();
        order.setState(new NewTaskState());
        System.out.println("Add Task");
    }

    @Override
    public void peerReview(Order order) {
        order.setState(new PeerReviewState());
        System.out.println("In Review");
    }

    @Override
    public void blocked(Order order) {
        order.setState(new BlockedState());
        System.out.println("In blocked");
    }
}
