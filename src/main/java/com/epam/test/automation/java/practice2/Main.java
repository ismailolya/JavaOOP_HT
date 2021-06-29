package com.epam.test.automation.java.practice2;

public class Main {

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int task1(int value) {
       if (value <= 0) {
            throw new IllegalArgumentException();
        }

        int sumOddResult = 0;
        while (value > 0) {
            if (value % 2 == 1) {
                sumOddResult = sumOddResult + value % 10;
            }
            value = value / 10;
        }
        return sumOddResult;
        
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException();
        }

        int sumBinaryResult = 0;
        int nBinary;

        while (value > 0){
            nBinary = value%2;
            sumBinaryResult += nBinary;
            value = value/2;
        }
        return sumBinaryResult;
    }

    /**
     * <summary>
     * Implement code according to description of task 3.
     * </summary>
     */
    public static int task3(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException();
        }

        int sumFibonacciResult = 0;
        int number = 1;
        int previousNumber = 0;
        int nextNumber;


       for (int i = 0; i < value-1; i++){
            nextNumber = previousNumber + number;
            sumFibonacciResult += number;
            previousNumber = number;
            number = nextNumber;
        }
        return sumFibonacciResult;
    }
}
