/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhadorcontrato;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicsondev
 */
public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    List<HourContract> contractList = new ArrayList<HourContract>();
    
    public Worker(String name, WorkerLevel level, Double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }
    
    public void addContract(HourContract contract) {
        contractList.add(contract);
    }
    
    public void removeContract(HourContract contract) {
        for(HourContract contractInList : contractList) {
            if(contract.getDate() == contractInList.getDate() && contract.getValuePerHour() == contractInList.getValuePerHour() && contract.getHour() == contractInList.getHour()) {
                contractList.remove(contractInList);
            }
        }
    }
    
}
