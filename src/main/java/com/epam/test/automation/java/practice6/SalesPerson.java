package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class SalesPerson extends Employee{

    private int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name,salary);
        this.percent=percent;
    }

    @Override
    public final void setBonus(BigDecimal bonus) {
        if(bonus.compareTo(BigDecimal.valueOf(0))==-1||bonus==null){
            throw new IllegalArgumentException(); }

        if (percent>100 && percent<=200){
            super.setBonus(bonus.multiply(BigDecimal.valueOf(2)));
        }
        else if (percent>200) {
            super.setBonus(bonus.multiply(BigDecimal.valueOf(3)));
        }
        else { super.setBonus(bonus);}
    }

}
