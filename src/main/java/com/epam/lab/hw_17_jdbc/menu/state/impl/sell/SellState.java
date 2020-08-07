package com.epam.lab.hw_17_jdbc.menu.state.impl.sell;

import com.epam.lab.hw_17_jdbc.menu.Menu;
import com.epam.lab.hw_17_jdbc.menu.state.State;
import com.epam.lab.hw_17_jdbc.menu.state.actions.sell_actions.SellActions;

public class SellState implements State {

    public SellState(Menu menu) {
        SellActions.sellAction(menu);
        addFlat(menu);
    }

    @Override
    public void addFlat(Menu menu) {
        menu.setState(new AddFlatState(menu));
    }
}
