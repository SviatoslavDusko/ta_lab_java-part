package com.epam.lab.hw_17_jdbc.menu.state.actions.sell_actions;

import com.epam.lab.hw_16_pattern.task2.Color;

import java.util.Scanner;

public class SellOrLeaseActions {
    public static int sellOrLeaseAction() {
        System.out.println(Color.BLUE);
        System.out.println("   1 - Sell" + "   2 - To lease   ");
        System.out.println("   Please, select menu point.");
        System.out.println(Color.RESET);

        return new Scanner(System.in).nextInt();
    }
}
