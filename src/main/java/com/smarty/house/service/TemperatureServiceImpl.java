package com.smarty.house.service;

import com.smarty.house.dao.TemperatureDAO;
import com.smarty.house.dto.TemperatureRequest;
import com.smarty.house.entity.Temperature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by nik on 1/10/18.
 */
@Service
public class TemperatureServiceImpl implements TemperatureService{

    @Autowired
    TemperatureDAO temperatureDAO;

    @Override
    public void saveTemperature(TemperatureRequest temperatureRequest) {

        Temperature temperature = new Temperature();

        temperature.setTemperature(temperatureRequest.getTemperature());
        temperature.setTime(new Date());

        temperatureDAO.saveTemperature(temperature);

    }
}
