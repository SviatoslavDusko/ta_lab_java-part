package com.epam.lab.hw_17_jdbc.dao;

import com.epam.lab.hw_17_jdbc.model.ClientEntity;

import java.sql.SQLException;

public interface ClientDAO extends GeneralDAO<ClientEntity, Integer> {
    ClientEntity findByEmail(String email) throws SQLException;

    ClientEntity findByEmailAndPassword(String email, String password) throws SQLException;
}
