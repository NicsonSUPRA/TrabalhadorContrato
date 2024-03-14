/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhadorcontrato;

import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author nicsondev
 */
public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hour;
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public HourContract(Date date, Double valuePerHour, Integer hour) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hour = hour;
    }
    
    public Double totalValue() {
        return valuePerHour*hour;
    }
    
    public Date getDate() {
        return date;
    }
    
    public Double getValuePerHour() {
        return valuePerHour;
    }
    
    public Integer getHour() {
        return hour;
    }
}
