package com.epam.lab.hw_17_jdbc.menu.state.impl.signin;

import com.epam.lab.hw_17_jdbc.menu.Menu;
import com.epam.lab.hw_17_jdbc.menu.state.State;
import com.epam.lab.hw_17_jdbc.menu.state.actions.signin_actions.SignUpActions;

public class SignUpState implements State {

    public SignUpState(Menu menu) {
        SignUpActions.registerUserAction();
        signIn(menu);
    }

    @Override
    public void signIn(Menu menu) {
        menu.setState(new StartState(menu));
    }
}
