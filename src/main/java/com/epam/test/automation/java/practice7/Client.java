package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;

public class Client {
    private Deposit [] deposits;


    public Client() {
        this.deposits = new Deposit[10];
    }

    public boolean addDeposit(Deposit deposit){
        for(int count = 0; count< deposits.length; count++){
            if(deposits[count]==null) {
                deposits[count] = deposit;
                return true;
            }
        }
        return false;
}

    public BigDecimal totalIncome(){
        BigDecimal sumIncome = BigDecimal.ZERO;
        for (Deposit deposit : deposits){
            if (deposit != null)
                sumIncome = sumIncome.add(deposit.income());
        } return sumIncome;
    }

    public BigDecimal maxIncome(){
        BigDecimal maxIncomeD = BigDecimal.ZERO;
        for (int i = 0; i < deposits.length&&deposits[i]!=null; i++) {
            if (deposits[i].income().compareTo(maxIncomeD) == 1)
                maxIncomeD = deposits[i].income();
        }return maxIncomeD;
    }

    public BigDecimal getIncomeByNumber(int number){

        if (number > deposits.length || deposits[number] == null) {
            return BigDecimal.ZERO;
        }
        return deposits[number].income();
    }
}
