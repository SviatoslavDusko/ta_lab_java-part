package com.epam.lab.hw_17_jdbc.dao.impl;

import com.epam.lab.hw_17_jdbc.dao.OrderDAO;
import com.epam.lab.hw_17_jdbc.db.Conn;
import com.epam.lab.hw_17_jdbc.model.OrderEntity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDAOImpl implements OrderDAO {
    private static final String FIND_ALL = "SELECT * FROM Orders";
    private static final String DELETE = "DELETE FROM Orders WHERE id=?";
    private static final String CREATE = "INSERT INTO Orders (flatId, clientIds) VALUES (?, ?)";
    private static final String UPDATE = "UPDATE Orders SET flatId=? AND ClientIds WHERE id=?";
    private static final String FIND_BY_ID = "SELECT * FROM Orders WHERE id=?";
    private static final String FIND_BY_FLAT_ID = "SELECT * FROM Orders WHERE flatId=?";

    @Override
    public List<OrderEntity> findAll() throws SQLException {
        List<OrderEntity> orders = new ArrayList<>();
        try (PreparedStatement ps = Conn.get().prepareStatement(FIND_ALL)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    orders.add(new OrderEntity(
                            rs.getInt("id"),
                            rs.getInt("flatId"),
                            rs.getInt("clientIds")));
                }
            }
        }
        return orders;
    }

    @Override
    public OrderEntity findById(Integer id) throws SQLException {
        OrderEntity order = new OrderEntity();
        try (PreparedStatement ps = Conn.get().prepareStatement(FIND_BY_ID)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    if (rs.getInt("id") == id) {
                        order = new OrderEntity(
                                rs.getInt("id"),
                                rs.getInt("flatId"),
                                rs.getInt("clientIds"));
                    }
                }
            }
        }
        return order;
    }

    @Override
    public int create(OrderEntity entity) throws SQLException {
        try (PreparedStatement ps = Conn.get().prepareStatement(CREATE)) {
            ps.setInt(1, entity.getFlatId());
            ps.setInt(2, entity.getClientId());
            return ps.executeUpdate();
        }
    }

    @Override
    public int update(OrderEntity entity) throws SQLException {
        try (PreparedStatement ps = Conn.get().prepareStatement(UPDATE)) {
            ps.setInt(1, entity.getFlatId());
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
    public OrderEntity findByFlatId(Integer flatId) throws SQLException {
        OrderEntity order = new OrderEntity();
        try (PreparedStatement ps = Conn.get().prepareStatement(FIND_BY_FLAT_ID)) {
            ps.setInt(1, flatId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    if (rs.getInt("flatId") == flatId) {
                        order = new OrderEntity(
                                rs.getInt("id"),
                                rs.getInt("flatId"),
                                rs.getInt("clientIds"));
                    }
                }
            }
        }
        return order;
    }
}
