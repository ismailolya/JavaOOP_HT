package com.epam.test.automation.java.practice8;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class Deposit implements Comparable<Deposit> {
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

    @Override
    public int compareTo(Deposit o) {
        return  (amount.add(this.income()).subtract(o.amount.add(o.income()))).intValue();
    }

    public abstract boolean canToProlong();
}

