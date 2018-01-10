package com.smarty.house.service;

import com.smarty.house.dto.TemperatureRequest;

/**
 * Created by nik on 1/10/18.
 */
public interface TemperatureService {
    void saveTemperature(TemperatureRequest temperatureRequest);
}
