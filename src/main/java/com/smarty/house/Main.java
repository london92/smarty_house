package com.smarty.house;

import com.smarty.house.controller.microcontroller.temperature.TemperatureController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by nik on 1/10/18.
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = TemperatureController.class)
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }
}
