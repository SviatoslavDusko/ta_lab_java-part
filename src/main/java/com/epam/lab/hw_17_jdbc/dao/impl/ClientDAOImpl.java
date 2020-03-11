package com.epam.lab.hw_17_jdbc.dao.impl;

import com.epam.lab.hw_17_jdbc.dao.ClientDAO;
import com.epam.lab.hw_17_jdbc.db.Conn;
import com.epam.lab.hw_17_jdbc.model.ClientEntity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientDAOImpl implements ClientDAO {
    private static final String FIND_ALL = "SELECT * FROM Clients";
    private static final String DELETE = "DELETE FROM Clients WHERE id=?";
    private static final String CREATE = "INSERT INTO Clients (firstName, lastName, email, phone, password) VALUES (?, ?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE Clients SET firstName=?, lastName=? WHERE id=?";
    private static final String FIND_BY_ID = "SELECT * FROM Clients WHERE id=?";
    private static final String FIND_BY_EMAIL = "SELECT * FROM Clients WHERE email=?";
    private static final String FIND_BY_EMAIL_AND_PASSWORD = "SELECT * FROM Clients WHERE email=? AND password=?";


    @Override
    public List<ClientEntity> findAll() throws SQLException {
        List<ClientEntity> clients = new ArrayList<>();
        try (PreparedStatement ps = Conn.get().prepareStatement(FIND_ALL)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    clients.add(new ClientEntity(
                            rs.getInt("id"),
                            rs.getString("firstName"),
                            rs.getString("lastName"),
                            rs.getString("email"),
                            rs.getString("phone"),
                            rs.getString("password")));
                }
            }
        }
        return clients;
    }

    @Override
    public ClientEntity findById(Integer id) throws SQLException {
        ClientEntity client = new ClientEntity();
        try (PreparedStatement ps = Conn.get().prepareStatement(FIND_BY_ID)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    if (rs.getInt("id") == id) {
                        client = new ClientEntity(
                                rs.getInt("id"),
                                rs.getString("firstName"),
                                rs.getString("lastName"),
                                rs.getString("email"),
                                rs.getString("phone"),
                                rs.getString("password"));
                    }
                }
            }
        }
        return client;
    }

    @Override
    public int create(ClientEntity entity) throws SQLException {
        try (PreparedStatement ps = Conn.get().prepareStatement(CREATE)) {
            ps.setString(1, entity.getFirstName());
            ps.setString(2, entity.getLastName());
            ps.setString(3, entity.getEmail());
            ps.setString(4, entity.getPhone());
            ps.setString(5, entity.getPassword());
            return ps.executeUpdate();
        }
    }

    @Override
    public int update(ClientEntity entity) throws SQLException {
        try (PreparedStatement ps = Conn.get().prepareStatement(UPDATE)) {
            ps.setString(1, entity.getFirstName());
            ps.setString(2, entity.getLastName());
            ps.setInt(3, entity.getId());
            return ps.executeUpdate();
        }
    }

    @Override
    public int delete(Integer id) throws SQLException {
        try (PreparedStatement ps = Conn.get().prepareStatement(DELETE)) {
            ps.setInt(1, id);
            return ps.executeUpdate();
        }
    }

    @Override
    public ClientEntity findByEmail(String email) throws SQLException {
        ClientEntity client = new ClientEntity();
        try (PreparedStatement ps = Conn.get().prepareStatement(FIND_BY_EMAIL)) {
            ps.setString(1, email);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    if (email.equalsIgnoreCase(rs.getString("email"))) {
                        client = new ClientEntity(
                                rs.getInt("id"),
                                rs.getString("firstName"),
                                rs.getString("lastName"),
                                rs.getString("email"),
                                rs.getString("phone"),
                                rs.getString("password"));
                    }
                }
            }
        }
        return client;
    }

    @Override
    public ClientEntity findByEmailAndPassword(String email, String password) throws SQLException {
        ClientEntity clientEntity = new ClientEntity();
        try (PreparedStatement ps = Conn.get().prepareStatement(FIND_BY_EMAIL_AND_PASSWORD)) {
            ps.setString(1, email);
            ps.setString(2, password);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    if (email.equalsIgnoreCase(rs.getString("email")) &&
                            password.equalsIgnoreCase(rs.getString("password"))) {
                        clientEntity = new ClientEntity(
                                rs.getInt("id"),
                                rs.getString("firstName"),
                                rs.getString("lastName"),
                                rs.getString("email"),
                                rs.getString("phone"),
                                rs.getString("password"));
                    }
                }
            }
        }
        return clientEntity;
    }
}
