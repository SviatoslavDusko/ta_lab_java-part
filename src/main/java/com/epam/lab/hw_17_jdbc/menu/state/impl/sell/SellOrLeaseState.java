package com.epam.lab.hw_17_jdbc.menu.state.impl.sell;

import com.epam.lab.hw_17_jdbc.menu.Menu;
import com.epam.lab.hw_17_jdbc.menu.state.State;
import com.epam.lab.hw_17_jdbc.menu.state.actions.sell_actions.SellOrLeaseActions;
import com.epam.lab.hw_17_jdbc.menu.state.actions.signin_actions.StartActions;

public class SellOrLeaseState implements State {
    public SellOrLeaseState(Menu menu) {
        int keyMenu = SellOrLeaseActions.sellOrLeaseAction();

        if (keyMenu == 1) {
            sell(menu);
        } else if (keyMenu == 2) {
            toLease(menu);
        } else {
            StartActions.wrongNumberEnteredAction();
            new SellOrLeaseState(menu);
        }
    }

    @Override
    public void sell(Menu menu) {
        menu.setState(new SellState(menu));
    }

    @Override
    public void toLease(Menu menu) {
        menu.setState(new LeaseState(menu));
    }


}
