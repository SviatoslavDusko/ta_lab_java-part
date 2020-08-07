package com.epam.lab.hw_17_jdbc.menu.state.impl.signin;

import com.epam.lab.hw_17_jdbc.menu.Menu;
import com.epam.lab.hw_17_jdbc.menu.state.State;
import com.epam.lab.hw_17_jdbc.menu.state.actions.signin_actions.SignInActions;
import com.epam.lab.hw_17_jdbc.menu.state.actions.signin_actions.StartActions;
import com.epam.lab.hw_17_jdbc.menu.state.impl.buy.BuyOrRentState;
import com.epam.lab.hw_17_jdbc.menu.state.impl.sell.SellOrLeaseState;

public class SignInState implements State {
    public SignInState(Menu menu) {
        int keyMenu = SignInActions.successfulSignInAction(menu);

        while (keyMenu != 1 && keyMenu != 2) {
            StartActions.wrongNumberEnteredAction();
            keyMenu = SignInActions.afterLogInAction();
        }

        if (keyMenu == 1) {
            buyOrRent(menu);
        } else if (keyMenu == 2) {
            sellOrToLease(menu);
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
