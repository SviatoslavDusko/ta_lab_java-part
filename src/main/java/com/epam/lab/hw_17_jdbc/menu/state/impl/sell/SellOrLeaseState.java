package com.epam.lab.hw_17_jdbc.menu.state.impl.sell;

import com.epam.lab.hw_16_pattern.task2.Color;
import com.epam.lab.hw_17_jdbc.menu.Menu;
import com.epam.lab.hw_17_jdbc.menu.state.State;

import java.util.Scanner;

public class SellOrLeaseState implements State {
    public SellOrLeaseState(Menu menu) {
        System.out.println(Color.BLUE);
        System.out.println("   1 - Sell" + "   2 - To lease   ");
        System.out.println("   Please, select menu point.");
        System.out.println(Color.RESET);

        int keyMenu;
        keyMenu = new Scanner(System.in).nextInt();

        if (keyMenu == 1) {
            sell(menu);
        } else if (keyMenu == 2) {
            toLease(menu);
        } else {
            System.out.println(Color.RED);
            System.out.println("Please, enter valid number.");
            new SellOrLeaseState(menu);
        }
    }

    @Override
    public void sell(Menu menu) {
        menu.setState(new SellState(menu));
    }

    @Override
    public void toLease(Menu menu) {
        menu.setState(new LeaseState(menu));
    }


}
