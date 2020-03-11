package com.epam.lab.hw_17_jdbc.dao.impl;

import com.epam.lab.hw_17_jdbc.dao.RealtorClientDAO;
import com.epam.lab.hw_17_jdbc.db.Conn;
import com.epam.lab.hw_17_jdbc.model.RealtorClientEntity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RealtorClientDAOImpl implements RealtorClientDAO {
    private static final String FIND_ALL = "SELECT * FROM RealtorClient";
    private static final String DELETE = "DELETE FROM RealtorClient WHERE id=?";
    private static final String CREATE = "INSERT INTO RealtorClient (realtorId, clientId) VALUES (?, ?)";
    private static final String UPDATE = "UPDATE RealtorClient SET clientId=? AND realtorId WHERE id=?";
    private static final String FIND_BY_ID = "SELECT * FROM RealtorClient WHERE id=?";
    private static final String FIND_BY_CLIENT_ID = "SELECT * FROM RealtorClient WHERE clientId=?";

    @Override
    public List<RealtorClientEntity> findAll() throws SQLException {
        List<RealtorClientEntity> realtorClientEntities = new ArrayList<>();
        try (PreparedStatement ps = Conn.get().prepareStatement(FIND_ALL)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    realtorClientEntities.add(new RealtorClientEntity(
                            rs.getInt("id"),
                            rs.getInt("realtorId"),
                            rs.getInt("clientId")));
                }
            }
        }
        return realtorClientEntities;
    }

    @Override
    public RealtorClientEntity findById(Integer id) throws SQLException {
        RealtorClientEntity realtorClientEntity = new RealtorClientEntity();
        try (PreparedStatement ps = Conn.get().prepareStatement(FIND_BY_ID)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    if (rs.getInt("id") == id) {
                        realtorClientEntity = new RealtorClientEntity(
                                rs.getInt("id"),
                                rs.getInt("realtorId"),
                                rs.getInt("clientId"));
                    }
                }
            }
        }
        return realtorClientEntity;
    }

    @Override
    public int create(RealtorClientEntity entity) throws SQLException {
        try (PreparedStatement ps = Conn.get().prepareStatement(CREATE)) {
            ps.setInt(1, entity.getRealtorId());
            ps.setInt(2, entity.getClientId());
            return ps.executeUpdate();
        }
    }

    @Override
    public int update(RealtorClientEntity entity) throws SQLException {
        try (PreparedStatement ps = Conn.get().prepareStatement(UPDATE)) {
            ps.setInt(1, entity.getClientId());
            ps.setInt(2, entity.getRealtorId());
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
    public RealtorClientEntity findByClientId(Integer id) throws SQLException {
        RealtorClientEntity realtorClientEntity = new RealtorClientEntity();
        try (PreparedStatement ps = Conn.get().prepareStatement(FIND_BY_CLIENT_ID)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    if (rs.getInt("clientId") == id) {
                        realtorClientEntity = new RealtorClientEntity(
                                rs.getInt("id"),
                                rs.getInt("realtorId"),
                                rs.getInt("clientId"));
                    }
                }
            }
        }
        return realtorClientEntity;
    }
}
