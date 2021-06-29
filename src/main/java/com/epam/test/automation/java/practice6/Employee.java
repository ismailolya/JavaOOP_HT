package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class Employee {
    protected String name;
    protected BigDecimal salary;
    protected BigDecimal bonus;

    public String getName() {return name;}

    public BigDecimal getSalary() {return salary;}

    public void setSalary(BigDecimal salary) {
        this.salary=salary;
    }

    public Employee(String name, BigDecimal salary) {
        this.name=name;
        this.salary=salary;
    }

    public void setBonus(BigDecimal bonus) {
        if(bonus.compareTo(BigDecimal.valueOf(0))==-1||bonus==null) {
            throw new IllegalArgumentException();}
        this.bonus=bonus;
    }

    public BigDecimal getBonus() {return bonus;}

    public BigDecimal toPay() {return salary.add(bonus);}


}


