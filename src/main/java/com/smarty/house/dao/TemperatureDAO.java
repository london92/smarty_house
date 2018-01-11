package com.smarty.house.dao;

import com.smarty.house.entity.Temperature;

import java.util.List;

/**
 * Created by nik on 1/10/18.
 */
public interface TemperatureDAO {
    void saveTemperature(Temperature temperature);
    List<Temperature> getAllData();
}
