package com.epam.lab.hw_17_jdbc.menu.state.actions.signin_actions;

import com.epam.lab.hw_16_pattern.task2.Color;

import java.util.Scanner;

public class StartActions {
    public static int signInOrSignUpAction() {
        System.out.println(Color.BLUE);
        System.out.println("   1 - Sign in" + "   2 - Sign up   ");
        System.out.println("   Please, select menu point.");
        System.out.println(Color.RESET);

        int keyMenu;
        keyMenu = new Scanner(System.in).nextInt();

        return keyMenu;
    }

    public static void wrongNumberEnteredAction() {
        System.out.println(Color.RED);
        System.out.println("Please, enter valid number.");
    }
}
