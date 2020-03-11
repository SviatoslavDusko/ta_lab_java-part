package com.epam.lab.hw_17_jdbc.menu.state.impl.signin;

import com.epam.lab.hw_16_pattern.task2.Color;
import com.epam.lab.hw_17_jdbc.dao.impl.ClientDAOImpl;
import com.epam.lab.hw_17_jdbc.menu.Menu;
import com.epam.lab.hw_17_jdbc.menu.state.State;
import com.epam.lab.hw_17_jdbc.menu.state.impl.buy.BuyOrRentState;
import com.epam.lab.hw_17_jdbc.menu.state.impl.sell.SellOrLeaseState;
import com.epam.lab.hw_17_jdbc.model.ClientEntity;

import java.sql.SQLException;
import java.util.Scanner;

public class SignInState implements State {

    public SignInState(Menu menu) {
        System.out.println(Color.CYAN);
        System.out.println("Please enter email:");
        String email = new Scanner(System.in).nextLine();
        System.out.println(Color.CYAN);
        System.out.println("Please enter password:");
        String password = new Scanner(System.in).nextLine();
        try {
            ClientEntity client = new ClientDAOImpl().findByEmailAndPassword(email, password);
            if (client.getEmail() != null) {
                menu.setCurrentClient(email, password);
                System.out.println("Successful login, " +
                        menu.getCurrentClient().getFirstName() + " " +
                        menu.getCurrentClient().getLastName() + "!");
            } else {
                System.out.println("email or pass is wrong.");
                new StartState(menu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(Color.BLUE);
        System.out.println("   1 - Buy or rent Flat" + "   2 - Sell or to lease Flat  ");
        System.out.println("   Please, select menu point.");
        System.out.println(Color.RESET);

        int keyMenu;
        keyMenu = new Scanner(System.in).nextInt();
        if (keyMenu == 1) {
            buyOrRent(menu);
        } else if (keyMenu == 2) {
            sellOrToLease(menu);
        } else {
            System.out.println(Color.RED);
            System.out.println("Please, enter valid number.");
            new SignInState(menu);
        }
    }

    @Override
    public void buyOrRent(Menu menu) {
        menu.setState(new BuyOrRentState(menu));
    }

    @Override
    public void sellOrToLease(Menu menu) {
        menu.setState(new SellOrLeaseState(menu));
    }
}
