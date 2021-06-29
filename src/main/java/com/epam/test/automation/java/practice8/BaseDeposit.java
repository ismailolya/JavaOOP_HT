package com.epam.test.automation.java.practice8;

import java.math.BigDecimal;
import java.math.RoundingMode;



public class BaseDeposit extends Deposit{
    public BaseDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal income() {
        if(getPeriod() <= 0){
            throw new IllegalArgumentException(); }

        BigDecimal total = getAmount().add(getAmount().multiply(BigDecimal.valueOf(0.05)));
        for (int i = 1; i < getPeriod(); i++) {
            total =  total.add(total.multiply(BigDecimal.valueOf(0.05)));
        }
        total = total.subtract(getAmount()).setScale(2, RoundingMode.FLOOR);
        return total;
    }

    @Override
    public boolean canToProlong() {
        return false;
    }
}

