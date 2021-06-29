package com.epam.test.automation.java.practice8;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LongDeposit extends Deposit implements Prolongable{
    public LongDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal income() {
        if(getPeriod() <= 0){
            throw new IllegalArgumentException(); }

        double percentage = 0.15;
        BigDecimal total = getAmount();
        if (getPeriod() > 6){
              for (int i = 0; i < getPeriod() - 6; i++) {
                total =  total.add(total.multiply(BigDecimal.valueOf(percentage)));
            }
            total= total.subtract(getAmount()).setScale(2, RoundingMode.FLOOR);
            return total;
        } else
        return BigDecimal.ZERO;
    }

    @Override
    public boolean canToProlong() {
        if(getPeriod() > 36)
        return false;
        return true;
    }
}
