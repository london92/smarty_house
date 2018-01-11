package com.smarty.house.service;

import com.smarty.house.dto.TemperatureRequest;
import com.smarty.house.entity.Temperature;

import java.util.List;

/**
 * Created by nik on 1/10/18.
 */
public interface TemperatureService {
    void saveTemperature(TemperatureRequest temperatureRequest);
    List<Temperature> getAllData();
}
