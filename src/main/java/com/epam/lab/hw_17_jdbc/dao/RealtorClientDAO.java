package com.epam.lab.hw_17_jdbc.dao;

import com.epam.lab.hw_17_jdbc.model.RealtorClientEntity;

import java.sql.SQLException;

public interface RealtorClientDAO extends GeneralDAO<RealtorClientEntity, Integer> {
    RealtorClientEntity findByClientId(Integer id) throws SQLException;
}
