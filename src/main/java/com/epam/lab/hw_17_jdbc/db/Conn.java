package com.epam.lab.hw_17_jdbc.db;


import com.epam.lab.hw_17_jdbc.сonstants.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    private static Connection connection = null;

    private Conn() {
    }

    public static Connection get() {
        String connectionString = "jdbc:mysql://" + DB.HOST + ":" + DB.PORT + "/" + DB.NAME;

        if (connection == null) {
            try {
                connection = DriverManager.getConnection(connectionString, DB.USER, DB.PASS);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
