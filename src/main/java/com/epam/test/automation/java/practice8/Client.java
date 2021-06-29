package com.epam.test.automation.java.practice8;

import java.math.BigDecimal;
import java.util.*;

public class Client implements Iterable <Deposit> {
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
        for (int i =0; i < deposits.length; i++){
            if (deposits[i] != null)
                sumIncome = sumIncome.add(deposits[i].income());
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

   @Override
    public Iterator<Deposit> iterator() {
        Iterator<Deposit> it = new Iterator<Deposit>() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < deposits.length  && deposits[currentIndex] != null;
            }

          @Override
            public Deposit next() {
                for (int count = 0; count < deposits.length; count++) {
                    return deposits[count];
                }
                throw new NoSuchElementException();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();}
            };
        return it;
        }

    public void sortDeposits (){
        Arrays.sort(deposits,
                Comparator.nullsLast(Comparator.reverseOrder()));
    }

    public int countPossibleToProlongDeposit(){
        int count = 0;
        for( Deposit deposit: deposits){
            if(deposit != null)
            if(deposit.canToProlong())
               count++;
        }return count;
    }
}


