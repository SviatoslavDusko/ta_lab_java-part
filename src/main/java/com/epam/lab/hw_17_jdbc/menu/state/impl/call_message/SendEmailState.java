package com.epam.lab.hw_17_jdbc.menu.state.impl.call_message;

import com.epam.lab.hw_17_jdbc.menu.Menu;
import com.epam.lab.hw_17_jdbc.menu.state.State;
import com.epam.lab.hw_17_jdbc.menu.state.actions.call_message_actions.SendEmailActions;
import com.epam.lab.hw_17_jdbc.menu.state.impl.delete.DeleteFlatState;

public class SendEmailState implements State {
    public SendEmailState(Menu menu) {
        SendEmailActions.sendEmailOwnerAction(menu);
        deleteFlat(menu);
    }

    @Override
    public void deleteFlat(Menu menu) {
        menu.setState(new DeleteFlatState(menu));
    }
}
