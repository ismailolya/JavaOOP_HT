package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class Company {
    private Employee [] employees;

    public Company(Employee... emp) {
        this.employees = emp;
    }

    public boolean giveEverybodyBonus (BigDecimal companyBonus){
        for (Employee emp: employees) {
           emp.setBonus(companyBonus);
        }
        return true;
    }

    public BigDecimal totalToPay(){
        BigDecimal total = BigDecimal.ZERO;
        for (Employee emp: employees) {
            total = total.add(emp.toPay());
        }
        return total;
    }

    public String nameMaxSalary(){
        BigDecimal maxSalary = BigDecimal.ZERO;
        String nameEmploee = new String();
        for (Employee emp: employees) {
            if(emp.toPay().compareTo(maxSalary) == 1){
                maxSalary = emp.toPay();
                nameEmploee = emp.getName();
            }
        }return nameEmploee;
    }
}
