package com.smarty.house.dao;

import com.smarty.house.entity.Temperature;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by nik on 1/10/18.
 */
@Transactional
@Repository
public class TemperatureDAOImpl implements TemperatureDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveTemperature(Temperature temperature) {
        entityManager.persist(temperature);
    }
}