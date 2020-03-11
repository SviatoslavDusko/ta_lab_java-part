package com.epam.lab.hw_17_jdbc.menu.state.impl.signin;

import com.epam.lab.hw_16_pattern.task2.Color;
import com.epam.lab.hw_17_jdbc.menu.Menu;
import com.epam.lab.hw_17_jdbc.menu.state.State;

import java.util.Scanner;

public class StartState implements State {

    public StartState(Menu menu) {
        System.out.println(Color.BLUE);
        System.out.println("   1 - Sign in" + "   2 - Sign up   ");
        System.out.println("   Please, select menu point.");
        System.out.println(Color.RESET);

        int keyMenu;
        keyMenu = new Scanner(System.in).nextInt();
        if (keyMenu == 1) {
            signIn(menu);
        } else if (keyMenu == 2) {
            signUp(menu);
        } else {
            System.out.println(Color.RED);
            System.out.println("Please, enter valid number.");
            new StartState(menu);
        }
    }

    @Override
    public void signIn(Menu menu) {
        menu.setState(new SignInState(menu));
    }

    @Override
    public void signUp(Menu menu) {
        menu.setState(new SignUpState(menu));
    }
}
