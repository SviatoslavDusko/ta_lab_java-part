package com.epam.lab.hw_17_jdbc.menu.state.actions.search_actions;

import com.epam.lab.hw_16_pattern.task2.Color;

public class NotFoundActions {
    public static void notFoundFlatAction() {
        System.out.println(Color.BLUE);
        System.out.println("   Found 0 flats, please enter other parameters.");
        System.out.println(Color.RESET);
    }
}
