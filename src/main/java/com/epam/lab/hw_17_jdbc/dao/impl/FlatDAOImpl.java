package com.epam.lab.hw_17_jdbc.dao.impl;

import com.epam.lab.hw_17_jdbc.dao.FlatDAO;
import com.epam.lab.hw_17_jdbc.db.Conn;
import com.epam.lab.hw_17_jdbc.model.FlatEntity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FlatDAOImpl implements FlatDAO {
    private static final String FIND_ALL = "SELECT * FROM Flats";
    private static final String DELETE = "DELETE FROM Flats WHERE id=?";
    private static final String CREATE = "INSERT INTO Flats (ownerId, realtorId, address, floor, roomCount, square, orderType, price) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE Flats SET price=? WHERE id=?";
    private static final String FIND_BY_ID = "SELECT * FROM Flats WHERE id=?";
    private static final String FIND_BY_PARAMETERS = "SELECT * FROM Flats WHERE " +
            "floor>? AND floor<? AND " +
            "roomCount=? AND " +
            "square>? AND square<? AND " +
            "orderType=? AND " +
            "price>? AND price<? AND " +
            "realtorId=?";

    @Override
    public List<FlatEntity> findAll() throws SQLException {
        List<FlatEntity> flats = new ArrayList<>();
        try (PreparedStatement ps = Conn.get().prepareStatement(FIND_ALL)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    flats.add(new FlatEntity(
                            rs.getInt("id"),
                            rs.getInt("ownerId"),
                            rs.getInt("realtorId"),
                            rs.getString("address"),
                            rs.getInt("floor"),
                            rs.getInt("roomCount"),
                            rs.getInt("square"),
                            rs.getString("orderType"),
                            rs.getInt("price")));
                }
            }
        }
        return flats;
    }

    @Override
    public FlatEntity findById(Integer id) throws SQLException {
        FlatEntity flat = new FlatEntity();
        try (PreparedStatement ps = Conn.get().prepareStatement(FIND_BY_ID)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    if (rs.getInt("id") == id) {
                        flat = new FlatEntity(
                                rs.getInt("id"),
                                rs.getInt("ownerId"),
                                rs.getInt("realtorId"),
                                rs.getString("address"),
                                rs.getInt("floor"),
                                rs.getInt("roomCount"),
                                rs.getInt("square"),
                                rs.getString("orderType"),
                                rs.getInt("price"));
                    }
                }
            }
        }
        return flat;
    }

    @Override
    public int create(FlatEntity entity) throws SQLException {
        try (PreparedStatement ps = Conn.get().prepareStatement(CREATE)) {
            ps.setInt(1, entity.getOwnerId());
            ps.setInt(2, entity.getRealtorId());
            ps.setString(3, entity.getAddress());
            ps.setInt(4, entity.getFloor());
            ps.setInt(5, entity.getRoomCount());
            ps.setInt(6, entity.getSquare());
            ps.setString(7, entity.getType());
            ps.setInt(8, entity.getPrice());
            return ps.executeUpdate();
        }
    }

    @Override
    public int update(FlatEntity entity) throws SQLException {
        try (PreparedStatement ps = Conn.get().prepareStatement(UPDATE)) {
            ps.setInt(1, entity.getPrice());
            ps.setInt(2, entity.getId());
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
    public List<FlatEntity> findByParameters(Integer minFloor, Integer maxFloor,
                                             Integer roomCount,
                                             Integer minSquare, Integer maxSquare,
                                             String orderType,
                                             Integer minPrice, Integer maxPrice,
                                             Integer realtorId) throws SQLException {
        List<FlatEntity> flats = new ArrayList<>();
        try (PreparedStatement ps = Conn.get().prepareStatement(FIND_BY_PARAMETERS)) {
            ps.setInt(1, minFloor);
            ps.setInt(2, maxFloor);
            ps.setInt(3, roomCount);
            ps.setInt(4, minSquare);
            ps.setInt(5, maxSquare);
            ps.setString(6, orderType);
            ps.setInt(7, minPrice);
            ps.setInt(8, maxPrice);
            ps.setInt(9, realtorId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    flats.add(new FlatEntity(
                            rs.getInt("id"),
                            rs.getInt("ownerId"),
                            rs.getInt("realtorId"),
                            rs.getString("address"),
                            rs.getInt("floor"),
                            rs.getInt("roomCount"),
                            rs.getInt("square"),
                            rs.getString("orderType"),
                            rs.getInt("price")));
                }
            }
        }
        return flats;
    }
}
