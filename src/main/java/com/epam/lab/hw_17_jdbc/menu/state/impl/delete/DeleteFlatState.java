package com.epam.lab.hw_17_jdbc.menu.state.impl.delete;

import com.epam.lab.hw_17_jdbc.menu.Menu;
import com.epam.lab.hw_17_jdbc.menu.state.State;
import com.epam.lab.hw_17_jdbc.menu.state.actions.delete_actions.DeleteFlatActions;

public class DeleteFlatState implements State {
    public DeleteFlatState(Menu menu) {
        DeleteFlatActions.deleteFlatAction(menu);
    }
}
