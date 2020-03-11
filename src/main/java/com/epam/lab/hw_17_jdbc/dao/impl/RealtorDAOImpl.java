package com.epam.lab.hw_17_jdbc.dao.impl;

import com.epam.lab.hw_17_jdbc.dao.RealtorDAO;
import com.epam.lab.hw_17_jdbc.db.Conn;
import com.epam.lab.hw_17_jdbc.model.RealtorEntity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RealtorDAOImpl implements RealtorDAO {
    private static final String FIND_ALL = "SELECT * FROM Realtors";
    private static final String DELETE = "DELETE FROM Realtors WHERE id=?";
    private static final String CREATE = "INSERT INTO Realtors (firstName, lastName, email, phone) VALUES (?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE Realtors SET firstName=?, lastName=? WHERE id=?";
    private static final String FIND_BY_ID = "SELECT * FROM Realtors WHERE id=?";
    private static final String FIND_RANDOM = "SELECT * FROM Realtors WHERE 1 ORDER BY RAND() LIMIT 1";

    @Override
    public List<RealtorEntity> findAll() throws SQLException {
        List<RealtorEntity> realtors = new ArrayList<>();
        try (PreparedStatement ps = Conn.get().prepareStatement(FIND_ALL)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    realtors.add(new RealtorEntity(
                            rs.getInt("id"),
                            rs.getString("firstName"),
                            rs.getString("lastName"),
                            rs.getString("email"),
                            rs.getString("phone")));
                }
            }
        }
        return realtors;
    }

    @Override
    public RealtorEntity findById(Integer id) throws SQLException {
        RealtorEntity realtor = new RealtorEntity();
        try (PreparedStatement ps = Conn.get().prepareStatement(FIND_BY_ID)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    if (rs.getInt("id") == id) {
                        realtor = new RealtorEntity(
                                rs.getInt("id"),
                                rs.getString("firstName"),
                                rs.getString("lastName"),
                                rs.getString("email"),
                                rs.getString("phone"));
                    }
                }
            }
        }
        return realtor;
    }

    @Override
    public int create(RealtorEntity entity) throws SQLException {
        try (PreparedStatement ps = Conn.get().prepareStatement(CREATE)) {
            ps.setString(1, entity.getFirstName());
            ps.setString(2, entity.getLastName());
            ps.setString(3, entity.getEmail());
            ps.setString(4, entity.getPhone());
            return ps.executeUpdate();
        }
    }

    @Override
    public int update(RealtorEntity entity) throws SQLException {
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
    public RealtorEntity findRandomOne() throws SQLException {
        RealtorEntity realtor = new RealtorEntity();
        try (PreparedStatement ps = Conn.get().prepareStatement(FIND_RANDOM)) {
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    realtor = new RealtorEntity(
                            rs.getInt("id"),
                            rs.getString("firstName"),
                            rs.getString("lastName"),
                            rs.getString("email"),
                            rs.getString("phone"));
                }
            }
        }
        return realtor;
    }
}
