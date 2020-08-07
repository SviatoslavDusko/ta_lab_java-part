package com.epam.lab.hw_17_jdbc.menu.state.impl.search;

import com.epam.lab.hw_17_jdbc.menu.Menu;
import com.epam.lab.hw_17_jdbc.menu.state.State;
import com.epam.lab.hw_17_jdbc.menu.state.actions.search_actions.NotFoundActions;

public class NotFoundState implements State {
    public NotFoundState(Menu menu) {
        NotFoundActions.notFoundFlatAction();
        setCharacteristicsSearchingFlat(menu);
    }

    @Override
    public void setCharacteristicsSearchingFlat(Menu menu) {
        menu.setState(new SetSearchFlatDataState(menu));
    }
}
