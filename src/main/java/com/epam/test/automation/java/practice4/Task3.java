package com.epam.test.automation.java.practice4;

public class Task3 {

   
    public static int multiArithmeticElements(int a1, int t, int n) {
        int result = a1;
        
        for (int i = 1; i < n; i++) {
            a1 = a1 + t;
            result *= a1;
        }
        return result;
    }
}
