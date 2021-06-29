package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SpecialDeposit extends Deposit {
    public SpecialDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }
    @Override
    public BigDecimal income() {
        if(getPeriod() <= 0){
            throw new IllegalArgumentException(); }

        double percent = 2;
        BigDecimal total = getAmount().add(getAmount().multiply(BigDecimal.valueOf(0.01)));
        for (int i = 1; i < getPeriod(); i++) {
            total = total.add(total.multiply(BigDecimal.valueOf(percent / 100)));
            percent += 1;
        }
        total = total.subtract(getAmount()).setScale(2, RoundingMode.FLOOR);
        return total;
    }
    
}
