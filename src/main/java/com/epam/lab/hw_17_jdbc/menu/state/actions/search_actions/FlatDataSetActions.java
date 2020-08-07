package com.epam.lab.hw_17_jdbc.menu.state.actions.search_actions;

import com.epam.lab.hw_16_pattern.task2.Color;
import com.epam.lab.hw_17_jdbc.dao.impl.FlatDAOImpl;
import com.epam.lab.hw_17_jdbc.dao.impl.RealtorClientDAOImpl;
import com.epam.lab.hw_17_jdbc.menu.Menu;
import com.epam.lab.hw_17_jdbc.model.FlatEntity;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class FlatDataSetActions {
    public static int setData(Menu menu) {
        System.out.println(Color.CYAN);
        System.out.println("Enter min floor:");
        Integer minFloor = new Scanner(System.in).nextInt();
        System.out.println("Enter max floor:");
        Integer maxFloor = new Scanner(System.in).nextInt();
        System.out.println("Enter room count:");
        Integer roomCount = new Scanner(System.in).nextInt();
        System.out.println("Enter min square:");
        Integer minSquare = new Scanner(System.in).nextInt();
        System.out.println("Enter max square:");
        Integer maxSquare = new Scanner(System.in).nextInt();
        System.out.println("Enter order type (Buy or Rent):");
        String orderType = new Scanner(System.in).nextLine();
        System.out.println("Enter min price:");
        Integer minPrice = new Scanner(System.in).nextInt();
        System.out.println("Enter max price:");
        Integer maxPrice = new Scanner(System.in).nextInt();
        try {
            String type = "";
            if (orderType.equalsIgnoreCase("buy")) {
                type = "sell";
            } else if (orderType.equalsIgnoreCase("rent")) {
                type = "toLease";
            }

            FlatDAOImpl flatDAO = new FlatDAOImpl();
            List<FlatEntity> flats = flatDAO.findByParameters(
                    minFloor, maxFloor, roomCount, minSquare,
                    maxSquare, type, minPrice, maxPrice,
                    new RealtorClientDAOImpl().findByClientId(menu.getCurrentClient().getId()).getRealtorId());

            if (flats.size() == 0) {
                return 0;
//                notFound(menu);
            } else {
                for (int i = 0; i < flats.size(); i++) {
                    System.out.println("Enter " + (i + 1) + " - " + flats.get(i));
                }
                System.out.println(Color.CYAN);
                System.out.println("Please, choose flat.");
                int flatNumber = new Scanner(System.in).nextInt();

                System.out.println(Color.BLUE);
                System.out.println("You choosed - " + flats.get(flatNumber - 1));
                menu.setCurrentFlat(flats.get(flatNumber - 1));
                System.out.println(Color.RESET);
                return 1;
//                found(menu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
