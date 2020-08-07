package com.epam.lab.hw_17_jdbc.menu.state.actions.sell_actions;

import com.epam.lab.hw_16_pattern.task2.Color;
import com.epam.lab.hw_17_jdbc.dao.impl.FlatDAOImpl;
import com.epam.lab.hw_17_jdbc.dao.impl.RealtorClientDAOImpl;
import com.epam.lab.hw_17_jdbc.menu.Menu;
import com.epam.lab.hw_17_jdbc.model.FlatEntity;

import java.sql.SQLException;
import java.util.Scanner;

public class LeaseActions {
    public static void leaseAction(Menu menu) {
        System.out.println(Color.CYAN);
        System.out.println("Enter address:");
        String address = new Scanner(System.in).nextLine();
        System.out.println("Enter floor:");
        Integer floor = new Scanner(System.in).nextInt();
        System.out.println("Enter room count:");
        Integer roomCount = new Scanner(System.in).nextInt();
        System.out.println("Enter square:");
        Integer square = new Scanner(System.in).nextInt();
        System.out.println("Enter price:");
        Integer price = new Scanner(System.in).nextInt();
        System.out.println(Color.RESET);

        try {
            FlatEntity flatEntity = new FlatEntity(menu.getCurrentClient().getId(),
                    new RealtorClientDAOImpl().findByClientId(menu.getCurrentClient().getId()).getRealtorId(),
                    address, floor, roomCount, square, "toLease", price);
            FlatDAOImpl flatDAO = new FlatDAOImpl();
            flatDAO.create(flatEntity);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(Color.BLUE);
        System.out.println("   You are added flat (To lease)!");
        System.out.println(Color.RESET);
    }
}
