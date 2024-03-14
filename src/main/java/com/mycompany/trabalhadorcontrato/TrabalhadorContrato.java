/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhadorcontrato;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo
(próxima página).
 * @author nicsondev
 */
public class TrabalhadorContrato {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        
        
        
        
        System.out.print("Enter department's name: ");
        String department = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Base Salary: ");
        double salary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(level), salary, department);
        
        
        System.out.print("How many contracts to this worker?");
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n; i++) {
            System.out.println("Enter contract " + i+1 + " data: ");
            System.out.print("Date dd/MM/yyyy: ");
            String date = sc.nextLine();
            Date contractDate = fmt.parse(date);
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("DUration: ");
            int hour = sc.nextInt();
            sc.nextLine();
            
            HourContract contract = new HourContract(contractDate, valuePerHour, hour);
            worker.addContract(contract);
            
        }
        
        System.out.print("Enter month and year to calculate income (MM/YYYY):");
        String monthAndYear = sc.nextLine();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Income for " + worker.income(year, month));
//        
    }
}
