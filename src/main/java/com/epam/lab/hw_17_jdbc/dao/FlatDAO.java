package com.epam.lab.hw_17_jdbc.dao;

import com.epam.lab.hw_17_jdbc.model.FlatEntity;

import java.sql.SQLException;
import java.util.List;

public interface FlatDAO extends GeneralDAO<FlatEntity, Integer> {
    List<FlatEntity> findByParameters(Integer minFloor, Integer maxFloor,
                                      Integer roomCount,
                                      Integer minSquare, Integer maxSquare,
                                      String orderType,
                                      Integer minPrice, Integer maxPrice,
                                      Integer realtorId) throws SQLException;
}
