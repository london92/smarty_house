package com.smarty.house.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by nik on 1/10/18.
 */
public class TemperatureRequest implements CreateRequest {
    @NotNull(message = "Temperature must not be null!")
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
