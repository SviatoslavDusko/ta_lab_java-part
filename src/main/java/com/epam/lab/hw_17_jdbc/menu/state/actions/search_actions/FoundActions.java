package com.epam.lab.hw_17_jdbc.menu.state.actions.search_actions;

import com.epam.lab.hw_16_pattern.task2.Color;
import com.epam.lab.hw_17_jdbc.dao.impl.OrderDAOImpl;
import com.epam.lab.hw_17_jdbc.menu.Menu;
import com.epam.lab.hw_17_jdbc.model.OrderEntity;

import java.sql.SQLException;
import java.util.Scanner;

public class FoundActions {
    public static int foundAction(Menu menu) {
        try {
            OrderDAOImpl orderDAO = new OrderDAOImpl();
            OrderEntity order = new OrderEntity(menu.getCurrentFlat().getId(), menu.getCurrentClient().getId());

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

        return new Scanner(System.in).nextInt();
    }
}
