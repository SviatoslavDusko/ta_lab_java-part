package com.epam.lab.hw_17_jdbc.menu;

import com.epam.lab.hw_17_jdbc.dao.impl.ClientDAOImpl;
import com.epam.lab.hw_17_jdbc.menu.state.State;
import com.epam.lab.hw_17_jdbc.menu.state.impl.signin.StartState;
import com.epam.lab.hw_17_jdbc.model.FlatEntity;
import com.epam.lab.hw_17_jdbc.model.OrderEntity;
import com.epam.lab.hw_17_jdbc.model.ClientEntity;

import java.sql.SQLException;

public class Menu {
    private State state;
    private ClientEntity currentClient;
    private OrderEntity currentOrder;
    private FlatEntity currentFlat;

    public Menu() {
        this.state = new StartState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public ClientEntity getCurrentClient() {
        return currentClient;
    }

    public void setCurrentClient(String email, String password) throws SQLException {
        currentClient = new ClientDAOImpl().findByEmailAndPassword(email, password);
    }

    public OrderEntity getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(OrderEntity currentOrder) {
        this.currentOrder = currentOrder;
    }

    public FlatEntity getCurrentFlat() {
        return currentFlat;
    }

    public void setCurrentFlat(FlatEntity currentFlat) {
        this.currentFlat = currentFlat;
    }
}
