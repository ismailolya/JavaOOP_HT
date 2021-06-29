package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;

public abstract class Deposit {
    public BigDecimal amount;
    public int period;

    public BigDecimal getAmount() {
        return amount;
    }

    public double getPeriod() {
        return period;
    }

    public Deposit(BigDecimal depositAmount, int depositPeriod) {
        this.amount = depositAmount;
        this.period = depositPeriod;
    }

    public abstract BigDecimal income();
}
