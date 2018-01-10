package com.smarty.house.controller.microcontroller.temperature;

import com.smarty.house.dto.CreateRequest;
import com.smarty.house.dto.TemperatureRequest;
import com.smarty.house.service.TemperatureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

import static com.smarty.house.controller.RestAPIConstants.REST_API_PREFIX;
import static com.smarty.house.controller.RestAPIConstants.REST_API_VERSION;
import static java.lang.String.format;

/**
 * Created by nik on 1/10/18.
 */
@Controller
@RequestMapping(REST_API_PREFIX + REST_API_VERSION + "/temperature")
public class TemperatureController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TemperatureController.class);

    @Autowired
    TemperatureService temperatureService;

    @PostMapping
    public void setTemperature (@Valid @RequestBody CreateRequest createRequest) {

        TemperatureRequest temperatureRequest = (TemperatureRequest) createRequest;

        LOGGER.debug(format("Setting new temperature data %s", temperatureRequest.getTemperature()));

        temperatureService.saveTemperature(temperatureRequest);

    }

}
