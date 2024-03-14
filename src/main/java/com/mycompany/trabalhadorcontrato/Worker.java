/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhadorcontrato;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author nicsondev
 */
public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    List<HourContract> contractList = new ArrayList<HourContract>();
    
    public Worker(String name, WorkerLevel level, Double baseSalary, String department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = new Department(department);
        
    }
    
    public String getName() {
        return name;
    }
    
    public void addContract(HourContract contract) {
        contractList.add(contract);
    }
    
    public void removeContract(HourContract contract) {
        for(HourContract contractInList : contractList) {
            contractList.remove(contractInList);
        }
    }
    
    public Double income(Integer year, Integer month) {
        Double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();
        for(HourContract contract : contractList) {
            calendar.setTime(contract.getDate());
            int contractYear = calendar.get(Calendar.YEAR);
            int contractMonth = calendar.get(Calendar.MONTH) + 1;
            if(year == contractYear && month == contractMonth) {
                sum+= contract.totalValue();
            }
            
        }
        return sum;
    }
    
    
    
}
