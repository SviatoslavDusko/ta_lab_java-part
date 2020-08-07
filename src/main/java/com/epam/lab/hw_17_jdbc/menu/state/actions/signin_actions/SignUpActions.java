package com.epam.lab.hw_17_jdbc.menu.state.actions.signin_actions;

import com.epam.lab.hw_16_pattern.task2.Color;
import com.epam.lab.hw_17_jdbc.dao.impl.ClientDAOImpl;
import com.epam.lab.hw_17_jdbc.dao.impl.RealtorClientDAOImpl;
import com.epam.lab.hw_17_jdbc.dao.impl.RealtorDAOImpl;
import com.epam.lab.hw_17_jdbc.model.ClientEntity;
import com.epam.lab.hw_17_jdbc.model.RealtorClientEntity;

import java.sql.SQLException;
import java.util.Scanner;

public class SignUpActions {
    public static void registerUserAction() {
        System.out.println(Color.CYAN);
        System.out.println("Please enter first name:");
        String firstName = new Scanner(System.in).nextLine();
        System.out.println("Please enter second name:");
        String secondName = new Scanner(System.in).nextLine();
        System.out.println("Please enter email:");
        String email = new Scanner(System.in).nextLine();
        System.out.println("Please enter phone number:");
        String phone = new Scanner(System.in).nextLine();
        System.out.println("Please enter password:");
        String password = new Scanner(System.in).nextLine();

        try {
            ClientEntity client = new ClientEntity(firstName, secondName, email, phone, password);
            ClientDAOImpl clientDAO = new ClientDAOImpl();
            clientDAO.create(client);

            RealtorClientEntity realtorClientEntity = new RealtorClientEntity(
                    new RealtorDAOImpl().findRandomOne().getId(),
                    clientDAO.findByEmailAndPassword(email, password).getId());
            new RealtorClientDAOImpl().create(realtorClientEntity);

            System.out.println(Color.BLUE);
            System.out.println("   You are signed up!");
            System.out.println(Color.RESET);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
