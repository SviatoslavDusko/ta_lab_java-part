package com.epam.lab.hw_17_jdbc.dao;

import com.epam.lab.hw_17_jdbc.model.OrderEntity;

import java.sql.SQLException;

public interface OrderDAO extends GeneralDAO<OrderEntity, Integer> {
    OrderEntity findByFlatId(Integer flatId) throws SQLException;
}
