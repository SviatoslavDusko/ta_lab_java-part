package com.epam.lab.hw_17_jdbc.menu.state.actions.signin_actions;

import com.epam.lab.hw_16_pattern.task2.Color;
import com.epam.lab.hw_17_jdbc.dao.impl.ClientDAOImpl;
import com.epam.lab.hw_17_jdbc.menu.Menu;
import com.epam.lab.hw_17_jdbc.menu.state.impl.signin.StartState;
import com.epam.lab.hw_17_jdbc.model.ClientEntity;

import java.sql.SQLException;
import java.util.Scanner;

public class SignInActions {
    public static int successfulSignInAction(Menu menu) {
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

        return afterLogInAction();
    }

    public static int afterLogInAction() {
        System.out.println(Color.BLUE);
        System.out.println("   1 - Buy or rent Flat" + "   2 - Sell or to lease Flat  ");
        System.out.println("   Please, select menu point.");
        System.out.println(Color.RESET);
        return new Scanner(System.in).nextInt();
    }
}
