package com.epam.lab.hw_17_jdbc.dao;

import com.epam.lab.hw_17_jdbc.model.RealtorEntity;

import java.sql.SQLException;

public interface RealtorDAO extends GeneralDAO<RealtorEntity, Integer> {
    RealtorEntity findRandomOne() throws SQLException;
}
