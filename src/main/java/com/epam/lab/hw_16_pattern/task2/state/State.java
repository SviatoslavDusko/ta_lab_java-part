package com.epam.lab.hw_16_pattern.task2.state;

import com.epam.lab.hw_16_pattern.task2.Order;

public interface State {

    default void addTask(Order order) {
        System.out.println("add task - is not allowed");
    }

    default void inProgress(Order order) {
        System.out.println("progress - is not allowed");
    }

    default void peerReview(Order order) {
        System.out.println("review - is not allowed");
    }

    default void inTest(Order order) {
        System.out.println("test - is not allowed");
    }

    default void done(Order order) {
        System.out.println("done - is not allowed");
    }

    default void blocked(Order order) {
        System.out.println("blocked - is not allowed");
    }
}
