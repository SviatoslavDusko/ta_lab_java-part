package com.epam.lab.hw_17_jdbc.menu.state.impl.search;

import com.epam.lab.hw_16_pattern.task2.Color;
import com.epam.lab.hw_17_jdbc.menu.Menu;
import com.epam.lab.hw_17_jdbc.menu.state.State;

public class NotFoundState implements State {
    public NotFoundState(Menu menu) {
        System.out.println(Color.BLUE);
        System.out.println("   Found 0 flats, please enter other parameters.");
        System.out.println(Color.RESET);
        setCharacteristicsSearchingFlat(menu);
    }

    @Override
    public void setCharacteristicsSearchingFlat(Menu menu) {
        menu.setState(new SetSearchFlatDataState(menu));
    }
}
