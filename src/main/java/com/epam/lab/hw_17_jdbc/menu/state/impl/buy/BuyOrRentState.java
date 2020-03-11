package com.epam.lab.hw_17_jdbc.menu.state.impl.buy;

import com.epam.lab.hw_17_jdbc.menu.Menu;
import com.epam.lab.hw_17_jdbc.menu.state.State;
import com.epam.lab.hw_17_jdbc.menu.state.impl.search.SetSearchFlatDataState;

public class BuyOrRentState implements State {

    public BuyOrRentState(Menu menu) {
        setCharacteristicsSearchingFlat(menu);
    }

    @Override
    public void setCharacteristicsSearchingFlat(Menu menu) {
        menu.setState(new SetSearchFlatDataState(menu));
    }
}
