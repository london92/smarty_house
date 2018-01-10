package com.smarty.house.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by nik on 1/10/18.
 */
@Entity
@Table(name = TableNames.TEMPERATURE)
public class Temperature implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name = "temperature")
    private double temperature;

    @Column(name = "time")
    private Date time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
