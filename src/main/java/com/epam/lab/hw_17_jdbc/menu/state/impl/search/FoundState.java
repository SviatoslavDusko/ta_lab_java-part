package com.epam.lab.hw_17_jdbc.menu.state.impl.search;

import com.epam.lab.hw_16_pattern.task2.Color;
import com.epam.lab.hw_17_jdbc.dao.impl.OrderDAOImpl;
import com.epam.lab.hw_17_jdbc.menu.Menu;
import com.epam.lab.hw_17_jdbc.menu.state.State;
import com.epam.lab.hw_17_jdbc.menu.state.impl.call_message.CallState;
import com.epam.lab.hw_17_jdbc.menu.state.impl.call_message.SendEmailState;
import com.epam.lab.hw_17_jdbc.model.OrderEntity;

import java.sql.SQLException;
import java.util.Scanner;

public class FoundState implements State {
    public FoundState(Menu menu) {
        try {
            OrderDAOImpl orderDAO = new OrderDAOImpl();
            OrderEntity order = new OrderEntity(menu.getCurrentFlat().getId(), menu.getCurrentClient().getId());
            System.out.println(order);

            orderDAO.create(order);
            menu.setCurrentOrder(orderDAO.findByFlatId(menu.getCurrentFlat().getId()));

            System.out.println(Color.BLUE);
            System.out.println("   Your order: " + orderDAO.findByFlatId(menu.getCurrentFlat().getId()));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("   1 - Send Email owner   " + "   2 - Call owner  ");
        System.out.println("   Please, select menu point.");
        System.out.println(Color.RESET);

        int keyMenu;
        keyMenu = new Scanner(System.in).nextInt();
        if (keyMenu == 1) {
            sendEmailOwner(menu);
        } else if (keyMenu == 2) {
            callOwner(menu);
        } else {
            System.out.println(Color.RED);
            System.out.println("Please, enter valid number.");
            new FoundState(menu);
        }
    }

    @Override
    public void sendEmailOwner(Menu menu) {
        menu.setState(new SendEmailState(menu));
    }

    @Override
    public void callOwner(Menu menu) {
        menu.setState(new CallState(menu));
    }
}
