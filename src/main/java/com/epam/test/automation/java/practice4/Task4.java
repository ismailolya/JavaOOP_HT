package com.epam.test.automation.java.practice4;

public class Task4 {

    
    public static double sumGeometricElements(int a1, double t, int alim) {
        if (t < 0 || t > 1) {
            throw new IllegalArgumentException();
        }

        double result = a1;
        double nextNumber = a1;

        while (nextNumber * t > alim){
            nextNumber = nextNumber * t;
            result += nextNumber;
        }return result;
    }
}
