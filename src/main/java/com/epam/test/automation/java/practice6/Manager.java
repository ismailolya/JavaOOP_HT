package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class Manager extends Employee{

    private int quantity;

    public Manager (String name, BigDecimal salary, int clientAmount) {
        super(name,salary);
        quantity =clientAmount;
    }

    @Override
    public final void setBonus(BigDecimal bonus) {
        if(bonus.compareTo(BigDecimal.valueOf(0))==-1||bonus==null){
            throw new IllegalArgumentException(); }

        if (quantity>100 && quantity<=150) {
            super.setBonus(bonus.add(BigDecimal.valueOf(500)));
        }
        else if (quantity>150) {
            super.setBonus(bonus.add(BigDecimal.valueOf(1000)));
        }
        else { super.setBonus(bonus); }
    }

}
