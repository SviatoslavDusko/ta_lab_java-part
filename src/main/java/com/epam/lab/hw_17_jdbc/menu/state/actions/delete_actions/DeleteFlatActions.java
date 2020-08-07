package com.epam.lab.hw_17_jdbc.menu.state.actions.delete_actions;

import com.epam.lab.hw_16_pattern.task2.Color;
import com.epam.lab.hw_17_jdbc.dao.impl.FlatDAOImpl;
import com.epam.lab.hw_17_jdbc.dao.impl.OrderDAOImpl;
import com.epam.lab.hw_17_jdbc.menu.Menu;

import java.sql.SQLException;

public class DeleteFlatActions {
    public static void deleteFlatAction(Menu menu) {
        try {
            OrderDAOImpl orderDAO = new OrderDAOImpl();
            orderDAO.delete(menu.getCurrentOrder().getId());

            FlatDAOImpl flatDAO = new FlatDAOImpl();
            flatDAO.delete(menu.getCurrentOrder().getFlatId());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println(Color.BLUE);
        System.out.println("   Flat deleted.");
        System.out.println(Color.RESET);
        System.exit(0);
    }
}
