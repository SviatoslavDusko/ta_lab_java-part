package com.epam.lab.hw_17_jdbc.menu.state.impl.sell;

import com.epam.lab.hw_17_jdbc.menu.Menu;
import com.epam.lab.hw_17_jdbc.menu.state.State;
import com.epam.lab.hw_17_jdbc.menu.state.actions.sell_actions.LeaseActions;

public class LeaseState implements State {
    public LeaseState(Menu menu) {
        LeaseActions.leaseAction(menu);
        addFlat(menu);
    }

    @Override
    public void addFlat(Menu menu) {
        menu.setState(new AddFlatState(menu));
    }
}
