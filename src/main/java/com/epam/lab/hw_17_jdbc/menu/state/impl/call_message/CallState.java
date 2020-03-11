package com.epam.lab.hw_17_jdbc.menu.state.impl.call_message;

import com.epam.lab.hw_16_pattern.task2.Color;
import com.epam.lab.hw_17_jdbc.dao.impl.ClientDAOImpl;
import com.epam.lab.hw_17_jdbc.dao.impl.FlatDAOImpl;
import com.epam.lab.hw_17_jdbc.menu.Menu;
import com.epam.lab.hw_17_jdbc.menu.state.State;
import com.epam.lab.hw_17_jdbc.menu.state.impl.delete.DeleteFlatState;
import com.epam.lab.hw_17_jdbc.model.ClientEntity;

import java.sql.SQLException;

public class CallState implements State {
    public CallState(Menu menu) {
        try {
            ClientEntity owner = new ClientDAOImpl().findById(
                    new FlatDAOImpl()
                            .findById(menu.getCurrentOrder().getFlatId()).getOwnerId());

            System.out.println(Color.BLUE);
            System.out.println("   Calling to " + owner.getPhone() + ".");
            System.out.println(Color.RESET);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        deleteFlat(menu);
    }

    @Override
    public void deleteFlat(Menu menu) {
        menu.setState(new DeleteFlatState(menu));
    }
}
