package com.epam.lab.hw_17_jdbc.menu.state.impl.search;

import com.epam.lab.hw_17_jdbc.menu.Menu;
import com.epam.lab.hw_17_jdbc.menu.state.State;
import com.epam.lab.hw_17_jdbc.menu.state.actions.search_actions.FoundActions;
import com.epam.lab.hw_17_jdbc.menu.state.actions.signin_actions.StartActions;
import com.epam.lab.hw_17_jdbc.menu.state.impl.call_message.CallState;
import com.epam.lab.hw_17_jdbc.menu.state.impl.call_message.SendEmailState;

public class FoundState implements State {
    public FoundState(Menu menu) {
        int keyMenu = FoundActions.foundAction(menu);
        if (keyMenu == 1) {
            sendEmailOwner(menu);
        } else if (keyMenu == 2) {
            callOwner(menu);
        } else {
            StartActions.wrongNumberEnteredAction();
            new FoundState(menu);
        }
    }

    @Override
    public void sendEmailOwner(Menu menu) {
        menu.setState(new SendEmailState(menu));
    }

    @Override
    public void callOwner(Menu menu) {
        menu.setState(new CallState(menu));
    }
}
